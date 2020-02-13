package FuntionalKotlinBook.method

class Cupcake(val flavour: String) {
    fun eat(): String {
        return "nom,nom,nom... delicious $flavour cupcake"
    }
}

fun main(args: Array<String>) {
    val myBlueberryCupcake = Cupcake("Blueberry")
    println(myBlueberryCupcake.eat())
}