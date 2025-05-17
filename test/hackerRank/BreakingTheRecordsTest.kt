package hackerRank

import org.junit.Assert.*
import org.junit.Test

class BreakingTheRecordsTest {
    @Test
    fun recordsReturnMaximumAndMinimumTest() {
        val result = breakingRecords(arrayOf(10, 5, 20, 20, 4, 5, 2, 25, 1)).joinToString(" ")
        assertEquals("2 4", result)
    }

}