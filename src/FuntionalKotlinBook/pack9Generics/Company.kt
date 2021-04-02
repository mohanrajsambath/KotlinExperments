package FuntionalKotlinBook.pack9Generics

class Company(text: String) {
    var x = text

    init {
        println(x)
    }
}

fun main(args: Array<String>) {
    var name: Company = Company("Hello World.... This is generics")
    //println("Generics Data class---=>${name.x}")

}