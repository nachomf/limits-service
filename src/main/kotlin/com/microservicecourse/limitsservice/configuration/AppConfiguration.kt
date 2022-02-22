package com.microservicecourse.limitsservice.configuration

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConfigurationProperties(prefix = "limits-service")
@ConstructorBinding
data class AppConfiguration(
    val minimum: Int,
    val maximum: Int,
)