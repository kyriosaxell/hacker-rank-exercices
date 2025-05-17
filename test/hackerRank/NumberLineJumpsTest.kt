package hackerRank

import org.junit.Assert.*
import org.junit.Test

class NumberLineJumpsTest {

    @Test
    fun checkBothNumberLineJumpsIsYesTest() {
        val result = kangaroo(x1 = 0, v1 = 3, x2 = 4, v2 = 2)
        assertEquals("YES", result)
    }

    @Test
    fun checkNumberLineJumpsIsNoTest() {
        val result = kangaroo(x1 = 0, v1 = 2, x2 = 5, v2 = 3)
        assertEquals("NO", result)
    }

    @Test
    fun checkNumberLineJumpsBigTest() {
        val result = kangaroo(1817, 9931, 8417, 190)
        assertEquals("NO", result)
    }
}