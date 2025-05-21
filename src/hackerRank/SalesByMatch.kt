package hackerRank

/*
 * Complete the 'sockMerchant' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER_ARRAY ar
 */
fun sockMerchant(n: Int, ar: Array<Int>): Int {
    var pairsNum = 0
    val sortedList = ar.sorted()
    var pos = 0
    var nextPos = 1
    val size = sortedList.size
    while (pos < size) {
        // no hay siguiente
        if (nextPos + 1 > size) break

        if (sortedList[pos] == sortedList[nextPos]) {
            pos += 2
            nextPos += 2
            pairsNum++
        } else {
            pos++
            nextPos++
        }
    }
    return pairsNum
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = sockMerchant(n, ar)

    println("Resultado $result")
    println(ar.sorted().joinToString(","))
}

object SalesByMatch {
    val largeListSocks = listOf(
        50,
        49,
        38,
        49,
        78,
        36,
        25,
        96,
        10,
        67,
        78,
        58,
        98,
        8,
        53,
        1,
        4,
        7,
        29,
        6,
        59,
        93,
        74,
        3,
        67,
        47,
        12,
        85,
        84,
        40,
        81,
        85,
        89,
        70,
        33,
        66,
        6,
        9,
        13,
        67,
        75,
        42,
        24,
        73,
        49,
        28,
        25,
        5,
        86,
        53,
        10,
        44,
        45,
        35,
        47,
        11,
        81,
        10,
        47,
        16,
        49,
        79,
        52,
        89,
        100,
        36,
        6,
        57,
        96,
        18,
        23,
        71,
        11,
        99,
        95,
        12,
        78,
        19,
        16,
        64,
        23,
        77,
        7,
        19,
        11,
        5,
        81,
        43,
        14,
        27,
        11,
        63,
        57,
        62,
        3,
        56,
        50,
        9,
        13,
        45
    ).toTypedArray()
}