package FuntionalKotlinBook.pack7Objects

class Outer {
    val internal = object {
        val property = ""
    }
}

fun main(args: Array<String>) {
    val outer = Outer()
    //println(outer.internal.property)// Compilation error: Unresolved reference: property
}