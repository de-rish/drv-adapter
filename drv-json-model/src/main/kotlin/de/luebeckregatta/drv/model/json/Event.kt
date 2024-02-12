package de.luebeckregatta.drv.model.json

import com.fasterxml.jackson.annotation.JsonProperty

data class Event(

    @field:JsonProperty("id")
    val id: String? = null,

    @field:JsonProperty("number")
	val number: String? = null,

    @field:JsonProperty("code")
	val code: String? = null,

    @field:JsonProperty("name")
    val name: String? = null,

    @field:JsonProperty("addition")
    val addition: String? = null,

    @field:JsonProperty("sex")
    val sex: String? = null,

    @field:JsonProperty("weighed")
    val weighed: Boolean? = null,

    @field:JsonProperty("days")
    val days: List<RegattaDay>,

    @field:JsonProperty("remarks")
    val remarks: String? = null,

    @field:JsonProperty("category")
    val category: Category? = null,

    @field:JsonProperty("boattype")
    val boattype: BoatType? = null,

    @field:JsonProperty("cost")
	val cost: Cost? = null,

    @field:JsonProperty("parent_event_id")
	val parentEventId: String? = null,

    @field:JsonProperty("number_addition")
	val numberAddition: String? = null
)