package com.mackie.boot

import com.mackie.boot.handler.BookHandler
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest
import org.springframework.context.annotation.Import
import org.springframework.http.MediaType
import org.springframework.test.web.reactive.server.WebTestClient

@WebFluxTest
@Import(BookHandler::class)
class IntegrationTests {

    @Autowired
    private lateinit var webClient: WebTestClient

    @Test
    fun `test the list handler for books`() {
        webClient.get()
            .uri("/list")
            .header("auth", "boomer")
            .accept(MediaType.APPLICATION_JSON)
            .exchange()
            .expectStatus().isOk
            .expectBody()
            .json("[{\"name\":\"The Hobbit\"},{\"name\":\"The Great Gatsby\"}]")
    }
}