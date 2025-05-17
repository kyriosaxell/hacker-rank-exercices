package chill

val A = listOf("a", "b", "c")
val B = listOf(1,2,3,4)

val resultReduce = A.zip(B) { a, b -> "$a -> $b"}

fun main() {
    println(resultReduce)
}