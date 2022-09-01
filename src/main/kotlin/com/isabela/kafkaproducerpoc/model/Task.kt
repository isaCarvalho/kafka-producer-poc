package com.isabela.kafkaproducerpoc.model

import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Date

data class Task(
    @JsonProperty("name")
    val name: String,
    @JsonProperty("startDate")
    val startDate: Date,
    @JsonProperty("endDate")
    val endDate: Date,
    @JsonProperty("done")
    val done: Boolean
)