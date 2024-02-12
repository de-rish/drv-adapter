package de.luebeckregatta.drv.model.json

import com.fasterxml.jackson.annotation.JsonProperty

data class Cost(

	@field:JsonProperty("id")
	val id: String? = null,

	@field:JsonProperty("name")
	val name: String? = null,

	@field:JsonProperty("currency")
	val currency: String? = null,

	@field:JsonProperty("amount")
	val amount: Double? = null
)