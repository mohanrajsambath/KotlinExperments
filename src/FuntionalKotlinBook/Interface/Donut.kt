package FuntionalKotlinBook.Interface

open class Donut(flavour: String, val topping: String) : BakeryGood(flavour), Fried {
    override fun name(): String {
        return "*swimming on Oil"
    }

    override fun fry(): String {
        return "dont with $topping topping"
    }
}


fun main(args: Array<String>) {
    val myDonut = Donut("Blueberry", "Custard")
    println("1- ${myDonut.flavour} ${myDonut.name()} ${myDonut.fry()}")


}