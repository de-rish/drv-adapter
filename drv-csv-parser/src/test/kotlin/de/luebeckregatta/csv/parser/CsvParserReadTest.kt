package de.luebeckregatta.csv.parser

import de.luebeckregatta.csv.parser.testdata.ActiveAthletsTestData
import de.luebeckregatta.testutils.TestUtils
import org.assertj.core.api.AssertionsForInterfaceTypes.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class CsvParserReadTest {

    @ParameterizedTest
    @ValueSource(strings = ["drv-aktivenpass.csv", "drv-aktivenpass-unknown-properties.csv"])
    fun shouldParseRegattaEvents(testCsvFileName: String) {
        // GIVEN
        val csvString = TestUtils.readStringContentFromTestResourceFile(testCsvFileName)

        // WHEN
        val actualParsedEvents = DrvCsvParser.parseDrvActiveAthlets(csvString)

        // THEN
        assertThat(actualParsedEvents).isEqualTo(ActiveAthletsTestData.TEST_ACTIVE_ATHLETS)
    }
}