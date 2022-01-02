fun main() {
    var five: Char = '5'
    println(five is Char)
    println(five.toString() is String)
    println(five.toByte() is Byte)
    println(five.toShort() is Short)
    println(five.toInt() is Int)
    println(five.toDouble() is Double)
    println(five.toFloat() is Float)
    println(five.toLong() is Long)
}