package de.luebeckregatta.parser

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.SerializationFeature
import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.kotlin.KotlinFeature
import com.fasterxml.jackson.module.kotlin.KotlinModule
import de.luebeckregatta.drv.model.json.DrvRegatta

object DrvJsonParser {

    private val kotlinModule = KotlinModule.Builder().configure(KotlinFeature.NullToEmptyCollection, true)
        .configure(KotlinFeature.NullToEmptyMap, true)
        .build()

    private val jsonMapper = JsonMapper.builder()
        .configure(SerializationFeature.INDENT_OUTPUT, true)
        .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
        .build()
        .setSerializationInclusion(JsonInclude.Include.NON_EMPTY)
        .registerModule(JavaTimeModule())
        .registerModule(kotlinModule)

    fun parseDrvRegatta(jsonString: String): DrvRegatta {
        return jsonMapper.readValue(jsonString, DrvRegatta::class.java)
    }
}