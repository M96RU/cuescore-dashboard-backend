package com.cuescore.dashboard.cuescoredashboardbackend

import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.stereotype.Controller

@Controller
class CuescoreDashboardController {

    @MessageMapping("/hello")
    @Throws(Exception::class)
    fun greeting(message: String) {
        println("Message received: $message")
    }
}