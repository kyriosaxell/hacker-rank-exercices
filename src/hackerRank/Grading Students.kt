package hackerRank

/* Hecho ✅️
 * Complete the 'gradingStudents' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY grades as parameter.
 */
const val MINIMUM_ROUNDING_GRADE = 38

fun gradingStudents(grades: Array<Int>): Array<Int> {
    val result = grades
        .map { it ->
            var grade = it
            // Si el grado cumple con el puntaje minimo para considerar ser redondeado
            if (it >= MINIMUM_ROUNDING_GRADE) {
                if ((it % 5) != 0) { // Identificamos si no es primo de 5
                    // Solo si la diferencia es menor a 3 se redondea el grado
                    if ((it + 1) % 5 == 0) {
                        grade = it + 1
                    } else if ((it + 2) % 5 == 0) {
                        grade = it + 2
                    }
                }
            }
            grade
        }
    return result.toTypedArray()
}

fun main(args: Array<String>) {
    val gradesCount = readLine()!!.trim().toInt()

    val grades = Array(gradesCount) { 0 }
    for (i in 0 until gradesCount) {
        val gradesItem = readLine()!!.trim().toInt()
        grades[i] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}
