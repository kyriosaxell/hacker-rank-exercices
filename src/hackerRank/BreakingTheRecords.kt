package hackerRank

/* Hecho ✅️
 * Complete the 'breakingRecords' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY scores as parameter.
 */
fun breakingRecords(scores: Array<Int>): Array<Int> {
    var resultArr = MutableList(2) { 0 }
    //
    var maximum = scores[0]
    var minimum = scores[0]

    scores.forEachIndexed { _, score->
        if (score > maximum) {
            maximum = score
            resultArr[0] += 1
        } else if (score < minimum) {
            minimum = score
            resultArr[1] += 1
        }
    }
    return resultArr.toTypedArray()
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val scores = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = breakingRecords(scores)

    println(result.joinToString(" "))
}
