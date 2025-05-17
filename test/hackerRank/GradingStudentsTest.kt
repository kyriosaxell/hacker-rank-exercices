package hackerRank

import org.junit.Assert.*
import org.junit.Test

class GradingStudentsTest {

    @Test
    fun studentsGradesTest() {
        val grades = arrayOf(73, 67, 38, 33)
        val expect = arrayOf(75, 67, 40, 33)
        val resultGrades = gradingStudents(grades)

        assertArrayEquals(expect, resultGrades)
    }
}