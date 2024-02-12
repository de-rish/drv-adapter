package de.luebeckregatta.drv.model.json

import com.fasterxml.jackson.annotation.JsonProperty
import java.time.Instant

data class Metadata(

	@field:JsonProperty("timestamp")
	val timestamp: Instant? = null,

	@field:JsonProperty("format_version")
	val formatVersion: String? = null
)