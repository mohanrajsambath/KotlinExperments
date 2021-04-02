package FuntionalKotlinBook.pack1Classes

class VeryBasic {
    fun doPrintHello() {
        println(" Hello World")
        println(" This is Kotlin Class")
    }
}

fun main(args: Array<String>) {
    val basic: VeryBasic = VeryBasic()
    basic.doPrintHello()
}