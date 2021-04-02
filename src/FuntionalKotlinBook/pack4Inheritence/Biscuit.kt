package FuntionalKotlinBook.pack4Inheritence

class Biscuit(flavour: String) : BakeryGood(flavour)

fun main(args: Array<String>) {
    val myBlueberryCupcake: BakeryGood = Biscuit("Chocolate Biscuit")
    println(myBlueberryCupcake.eat())
}