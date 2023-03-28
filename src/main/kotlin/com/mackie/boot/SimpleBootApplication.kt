package com.mackie.boot

import com.mackie.boot.config.AppConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(AppConfiguration::class)
class SimpleBootApplication

fun main(args: Array<String>) {
    runApplication<SimpleBootApplication>(*args)
}
