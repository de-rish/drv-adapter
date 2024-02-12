package de.luebeckregatta.drv.model.json

import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDate

data class Regatta(

	@field:JsonProperty("id")
	val id: String? = null,

	@field:JsonProperty("name")
	val name: String? = null,

	@field:JsonProperty("city")
	val city: String? = null,

	@field:JsonProperty("website")
	val website: String? = null,

	@field:JsonProperty("language")
	val language: String? = null,

	@field:JsonProperty("days")
	val days: List<LocalDate>
)