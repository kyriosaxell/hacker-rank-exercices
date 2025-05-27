package hackerRank

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

// Complete the catAndMouse function below.
/**
 * @param x Pos del gato A
 * @param y Pos del gato B
 * @param z Pos del ratón
 */
fun catAndMouse(x: Int, y: Int, z: Int): String {
    val distanceA = if (z > x) z - x else x - z
    val distanceB = if (z > y) z - y else y - z
    return if (distanceA == distanceB) "Mouse C" else if (distanceA < distanceB) "Cat A" else "Cat B"
}

fun main(args: Array<String>) {
    val q = readLine()?.trim()!!.toInt()

    for (idx in 1..q) {
        val xyz = readLine()!!.split(" ")

        val x = xyz[0].trim().toInt()

        val y = xyz[1].trim().toInt()

        val z = xyz[2].trim().toInt()

        val result = catAndMouse(x, y, z)

        println(result)
    }
}

private class CatsAndAMouseTest() {
    @Test
    fun `1 2 3 positions returns 'Cat B'`() {
        catAndMouse(1, 2, 3) shouldBeEqualTo "Cat B"
    }

    @Test
    fun `1 3 2 positions returns 'Mouse C'`() {
        catAndMouse(1, 3, 2) shouldBeEqualTo "Mouse C"
    }

}