package chill

import java.time.Month
import java.util.Calendar
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

fun main() {
    val al = D()
    al.printToDate()
}

class D {
    var date: MyDate by EffectiveDate()

    fun printToDate() {
        date = System.currentTimeMillis().toDate()
        println("Dia: ${date.day} Mes: ${date.month} Año: ${date.year}")
    }
}

class EffectiveDate<R> : ReadWriteProperty<R, MyDate> {
    var timeInMillis: Long? = null

    override fun getValue(thisRef: R, property: KProperty<*>): MyDate {
        return timeInMillis!!.toDate()
    }

    override fun setValue(thisRef: R, property: KProperty<*>, value: MyDate) {
        timeInMillis = value.toMillis()
    }
}

data class MyDate(val year: Int, val month: Int, val day: Int)

fun MyDate.toMillis(): Long {
    val c = Calendar.getInstance()
    c.set(year, month, day)
    return c.timeInMillis
}

fun Long.toDate(): MyDate {
    val c = Calendar.getInstance()
    c.timeInMillis = this
    return MyDate(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DATE))
}