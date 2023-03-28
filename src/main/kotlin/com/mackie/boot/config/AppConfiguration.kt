package com.mackie.boot.config

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "app")
data class AppConfiguration(
    val books: List<String>
)