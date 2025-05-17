package chill

const val POINTS_X_PASS: Int = 15
val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)   // 1
val EZPassReport: Map<Int, Int> = EZPassAccounts

fun updatePointsCredit(accountId: Int, pointsSum: Int) {
    if (EZPassAccounts.containsKey(accountId)) {
        println("Actualizando $accountId...")
        EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + pointsSum
    } else {
        println("Error al actualizar")
    }
}

fun accountsReport() {
    println("EZ-Pass report:")
    EZPassReport.forEach { (k, v) -> println("ID $k: credit: $v") }
}


fun main() {
    accountsReport()
    updatePointsCredit(1, 5)
    updatePointsCredit(1, 3)
    updatePointsCredit(5, 19)
    accountsReport()
}
