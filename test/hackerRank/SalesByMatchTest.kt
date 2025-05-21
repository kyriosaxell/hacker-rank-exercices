package hackerRank

import org.junit.Assert.*
import org.junit.Test

class SalesByMatchTest {


    @Test
    fun socksNumOfPairsTest() {
        val result = sockMerchant(9, arrayOf(10, 20, 20, 10, 10, 30, 50, 10, 20))
        assertEquals(3, result)
    }

    @Test
    fun largeSocksNumOfPairsTest() {
        val result = sockMerchant(100, SalesByMatch.largeListSocks)
        assertEquals(28, result)
    }

    @Test
    fun caseOneSocksNumOfPairsTest() {
        val lista = listOf(
            6, 5, 2, 3, 5, 2, 2, 1, 1, 5, 1, 3, 3, 3, 5
        ).toTypedArray()

        val result = sockMerchant(9, lista)
        assertEquals(6, result)
    }

}