package hackerRank

import javax.swing.event.InternalFrameAdapter

/*
 * Complete the 'pageCount' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER p
 */
fun pageCount(n: Int, p: Int): Int {
    var turnsPage = 0
    // var currentPage = 1
    for (i in 1 until n) {
        if (i == p) {
            break
        }
        if (i % 2 != 0) {
            turnsPage++
        }
    }

    return turnsPage
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val p = readLine()!!.trim().toInt()

    val result = pageCount(n, p)

    println(result)
}

// [0,1]->[2,3],[4,5]->[6,7]