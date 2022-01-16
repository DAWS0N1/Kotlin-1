fun main() {
    println("Введите 2 числа поочереди!\n")
    println("Проверим, что число ")
    val a = readLine()
    println(" больше чем ")
    val b = readLine()
    val isTrue: Boolean = a!!.toInt() > b!!.toInt()
    println("$isTrue")
}