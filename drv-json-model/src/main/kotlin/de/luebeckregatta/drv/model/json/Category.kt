package de.luebeckregatta.drv.model.json

import com.fasterxml.jackson.annotation.JsonProperty

data class Category(

	@field:JsonProperty("id")
	val id: String? = null,

	@field:JsonProperty("code")
	val code: String? = null,

	@field:JsonProperty("name")
	val name: String? = null
)