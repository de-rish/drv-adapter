package de.luebeckregatta.drv.model.csv

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonPropertyOrder(
    "Id",
    "Vorname",
    "Nachname",
    "Titel",
    "Geschlecht",
    "Jahrgang",
    "Vereinsnummer",
    "Vereinsname",
    "Startberechtigt"
)
data class ActiveAthlet(

    @field:JsonProperty("Id")
    val drvId: String,

    @field:JsonProperty("Vorname")
    val givenName: String,

    @field:JsonProperty("Nachname")
    val name: String,

    @field:JsonProperty("Titel")
    val title: String,

    @field:JsonProperty("Geschlecht")
    val sex: String,

    @field:JsonProperty("Jahrgang")
    val birthYear: Int,

    @field:JsonProperty("Vereinsnummer")
    val drvClubId: String,

    @field:JsonProperty("Vereinsname")
    val clubName: String,

    @field:JsonProperty("Startberechtigt")
    val startPermission: String
)
