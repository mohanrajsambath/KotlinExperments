package FuntionalKotlinBook.Inheritence

class Cupcake(flavor: String) : BakeryGood(flavor)

fun main(args: Array<String>) {
    val myBlueberryCupcake: BakeryGood = Cupcake("Blueberry")
    println(myBlueberryCupcake.eat())
}