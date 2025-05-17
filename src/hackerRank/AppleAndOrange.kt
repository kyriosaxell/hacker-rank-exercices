package hackerRank

/* Hecho ✅️
 * Complete the 'countApplesAndOranges' function below.
 *
 * The function accepts following parameters:
 *  1. INTEGER s
 *  2. INTEGER t
 *  3. INTEGER a
 *  4. INTEGER b
 *  5. INTEGER_ARRAY apples
 *  6. INTEGER_ARRAY oranges
 */
fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>) {
    var numApple = 0
    var numOrange = 0

    apples.forEach {
        val current = a + it
        if (current >= s && current <= t){
            numApple++
        }
    }

    oranges.forEach {
        val current = b + it
        if (current >= s && current <= t){
            numOrange++
        }
    }

    println(numApple)
    println(numOrange)
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    // Posición de inicio de la casa
    val s = first_multiple_input[0].toInt()
    // Posición final de la casa
    val t = first_multiple_input[1].toInt()

    val second_multiple_input = readLine()!!.trimEnd().split(" ")
    // Ubicación del manzano
    val a = second_multiple_input[0].toInt()
    // Ubicación del naranjo
    val b = second_multiple_input[1].toInt()

    val third_multiple_input = readLine()!!.trimEnd().split(" ")
    // total de manzanas
    val m = third_multiple_input[0].toInt()
    // total de naranjas
    val n = third_multiple_input[1].toInt()
    // Distancia de donde cayó cada manzana
    val apples = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    // Distancia de donde cayó cada naranja
    val oranges = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    countApplesAndOranges(s, t, a, b, apples, oranges)
}
