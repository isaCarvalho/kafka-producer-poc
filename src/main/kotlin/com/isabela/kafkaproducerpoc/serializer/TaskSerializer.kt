package com.isabela.kafkaproducerpoc.serializer

import com.isabela.kafkaproducerpoc.proto.TaskPBOuterClass
import org.apache.kafka.common.errors.SerializationException
import org.apache.kafka.common.serialization.Serializer
import org.slf4j.LoggerFactory

class TaskSerializer : Serializer<TaskPBOuterClass.TaskPB> {

    private val log = LoggerFactory.getLogger(javaClass)

    override fun serialize(topic: String?, data: TaskPBOuterClass.TaskPB?): ByteArray {
        log.info("Serializing...")
        return data?.toByteArray() ?: throw SerializationException("Error when serializing Product to JSON")
    }
}