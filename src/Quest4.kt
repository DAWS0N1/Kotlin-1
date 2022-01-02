fun main() {

    println("Как вас зовут?")

    var userName: String? = readLine()

    var stringName: String = userName.toString()

    print("Привет, $stringName!")
}