package de.luebeckregatta.drv.model.json

import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDate

data class RegattaDay(

	@field:JsonProperty("day_date")
	val dayDate: LocalDate? = null,

	@field:JsonProperty("sort_order")
	val sortOrder: Int? = null
)