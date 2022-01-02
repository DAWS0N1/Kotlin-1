fun main() {
    println("Введите 2 числа поочереди!\n")
    println("Проверим, что число ")
    val a = readLine()
    println(" больше чем ")
    val b = readLine()
    println("${a!!.toInt() > b!!.toInt()}")
}