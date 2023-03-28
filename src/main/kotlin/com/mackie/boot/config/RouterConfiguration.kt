package com.mackie.boot.config

import com.mackie.boot.handler.BookHandler
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.web.reactive.config.WebFluxConfigurer
import org.springframework.web.reactive.function.server.*

@Configuration
class RouterConfiguration : WebFluxConfigurer {

    @Bean
    fun statusRouter(
        handler: BookHandler
    ): RouterFunction<ServerResponse> = coRouter {
        contentType(MediaType.APPLICATION_JSON)
        GET("/list", handler::getList)
    }
}