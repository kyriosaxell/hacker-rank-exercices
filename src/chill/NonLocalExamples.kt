package chill

class Supplier(val c: Char) {
    fun supplyValue(): Int {
        return c.code
    }

    fun isValid(): Boolean {
        return c.code % 2 == 0
    }
}

fun main() {
    for (letter in listOf('A', 'B', 'C', 'D'))
        with(Supplier(letter)) {
            //if (!isValid()) continue
            val value = supplyValue()
            println(value)
        }
}