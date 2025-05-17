package chill

fun buildCar(config: Car.() -> Unit): Car {
    val car = Car()
    car.config()
    return car
}

class Car {
    var color: String = "Negro"
    var doors: Int = 4
}

val isZero: Int.() -> Boolean = {
    this == 0
}

fun main() {
    val myCar = buildCar {
        color = "Rojo"
        doors = 2
    }
    println(myCar.color)
    println(89.isZero())
    println(0.isZero())
}