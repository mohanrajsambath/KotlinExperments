package FuntionalKotlinBook.Objects

fun main(args: Array<String>) {
    val expression = object {
        val property = " is a TestObject"
        fun methodInt(): Int {
            println("from an object Int expression")
            return 42
        }

        fun methodString(): String {
            println("from an object String expression")
            return "ABCDEF"
        }
    }

    val i = "${expression.methodInt()}  ${expression.property}"

    println(i)
    //val i2=${expression.methodString()}
    println("${expression.methodString()}")

}