package com.cuescore.dashboard.cuescoredashboardbackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.messaging.handler.annotation.MessageMapping

@SpringBootApplication
class CuescoreDashboardBackendApplication {

    @MessageMapping("/chat")
//	@SendTo("/topic/messages")
    @Throws(Exception::class)
    fun send(message: Message) {
        println("====== Receiving message")
    }

}

fun main(args: Array<String>) {
    runApplication<CuescoreDashboardBackendApplication>(*args)
}
