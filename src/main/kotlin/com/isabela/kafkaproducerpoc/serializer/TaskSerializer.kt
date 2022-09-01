package com.isabela.kafkaproducerpoc.serializer

import com.fasterxml.jackson.databind.ObjectMapper
import com.isabela.kafkaproducerpoc.model.Task
import org.apache.kafka.common.errors.SerializationException
import org.apache.kafka.common.serialization.Serializer
import org.slf4j.LoggerFactory

class TaskSerializer : Serializer<Task> {

    private val objectMapper = ObjectMapper()
    private val log = LoggerFactory.getLogger(javaClass)

    override fun serialize(topic: String?, data: Task?): ByteArray {
        log.info("Serializing...")
        return objectMapper.writeValueAsBytes(
            data ?: throw SerializationException("Error when serializing Product to JSON")
        )
    }
}