package de.luebeckregatta.drv.model.json

import com.fasterxml.jackson.annotation.JsonProperty

data class DrvRegatta(

	@field:JsonProperty("_metadata")
	val metadata: Metadata? = null,

	@field:JsonProperty("regatta")
	val regatta: Regatta? = null,

	@field:JsonProperty("events")
	val events: List<Event>
)