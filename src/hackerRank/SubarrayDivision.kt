package hackerRank

import org.junit.jupiter.api.Test

/*
 * Complete the 'birthday' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY s
 *  2. INTEGER d
 *  3. INTEGER m
 */
fun birthday(s: Array<Int>, d: Int, m: Int): Int {
    // Write your code here
    var consecutives = 0
    var count = 0
    var lastValue = 0
/*    s.fold(0) { f, value ->
        if (value == lastValue) consecutives++

        if (consecutives > 2) {
            count = 0
            return@forEach
        }

        if (count == 0) {
            if ( value == d || (value + lastValue == d)) {
                count++
                lastValue = value
            }
        } else {
            if (value == m || (value + lastValue == m)) {
                count++
                return@forEach
            }
        }
    }*/
    return count
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val s = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val d = first_multiple_input[0].toInt()

    val m = first_multiple_input[1].toInt()

    val result = birthday(s, d, m)

    println(result)
}

private class Test {
    @Test
    fun `six squares of values '1 1 1 1 1 1' returns '3 2'`() {
        birthday(arrayOf(1, 1, 1, 1, 1, 1), 3, 2)
    }
}