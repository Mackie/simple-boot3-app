package com.mackie.boot.handler

import com.mackie.boot.config.AppConfiguration
import com.mackie.boot.domain.Book
import kotlinx.coroutines.flow.asFlow
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.server.*

@Service
class BookHandler(private val config: AppConfiguration) {
    suspend fun getList(request: ServerRequest): ServerResponse =
        runCatching {
            ServerResponse.ok().json().bodyAndAwait(config.books.map { Book(it) }.asFlow())
        }.getOrDefault(ServerResponse.badRequest().buildAndAwait())
}