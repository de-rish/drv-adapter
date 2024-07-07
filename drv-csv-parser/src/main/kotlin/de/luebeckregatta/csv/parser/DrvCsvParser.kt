package de.luebeckregatta.csv.parser

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.dataformat.csv.CsvMapper
import com.fasterxml.jackson.dataformat.csv.CsvSchema
import com.fasterxml.jackson.module.kotlin.KotlinModule
import de.luebeckregatta.drv.model.csv.ActiveAthlet

object DrvCsvParser {

    private val kotlinModule = KotlinModule.Builder()
        .build()

    private val csvMapper = CsvMapper.builder()
        .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
        .addModule(kotlinModule)
        .build()

    fun parseDrvActiveAthlets(csvString: String): List<ActiveAthlet> {
        return csvMapper.readerFor(ActiveAthlet::class.java)
            .with(CsvSchema.emptySchema().withColumnSeparator(';').withHeader())
            .readValues<ActiveAthlet>(csvString)
            .readAll()
    }
}