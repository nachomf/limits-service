package com.microservicecourse.limitsservice.controller

import com.microservicecourse.limitsservice.configuration.AppConfiguration
import com.microservicecourse.limitsservice.model.Limits
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class LimitsController(
    private val appConfiguration: AppConfiguration
) {
    @GetMapping("/limits")
    fun retrieveAllLimits() = Limits(appConfiguration.minimum, appConfiguration.maximum)
}