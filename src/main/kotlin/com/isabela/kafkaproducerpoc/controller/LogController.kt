package com.isabela.kafkaproducerpoc.controller

import com.isabela.kafkaproducerpoc.model.Task
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.kafka.support.KafkaHeaders
import org.springframework.messaging.Message
import org.springframework.messaging.support.MessageBuilder
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/product")
class LogController(
    @Value("\${kafka.topics.task}") val topic: String,
    @Autowired
    private val kafkaTemplate: KafkaTemplate<String, Any>
) {
    private val log = LoggerFactory.getLogger(javaClass)

    @PostMapping
    fun post(@Validated @RequestBody task: Task): ResponseEntity<Any> {
        return try {
            log.info("Receiving product request")
            log.info("Sending message to Kafka {}", task)
            val message : Message<Task> = MessageBuilder
                .withPayload(task)
                .setHeader(KafkaHeaders.TOPIC, topic)
                .build()

            kafkaTemplate.send(message)
            log.info("Message sent with success")

            ResponseEntity.ok().build()
        } catch (e: Exception) {
            log.error("Exception: {}", e)
            ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error to send message")
        }
    }
}