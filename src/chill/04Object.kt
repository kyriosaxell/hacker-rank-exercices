package chill

fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int) {
    val dayRates = object {
        var standard = 30 * standardDays
        var festivity = 50 * festivityDays
        var special = 100 * specialDays
    }
    val total = dayRates.standard + dayRates.festivity + dayRates.special

    println("Total price: $$total")
}

fun main() {
    rentPrice(10, 3, 1)
}