package hackerRank

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class DrawingBookTest {
    @Test
    fun `numero de pagina test`() {
        val result1 = pageCount(6, 2)
        assertThat(result1,`is`(1))

        val result2 = pageCount(5,4)
        assertThat(result2, `is`(0))
    }

}