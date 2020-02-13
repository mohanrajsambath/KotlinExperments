package FuntionalKotlinBook.Inheritence

class Donut(flavour: String, val topping: String) : BakeryGoodOverrideFunc(flavour) {
    override fun name(): String {
        return "Dont with $topping topping"
    }
}

fun main(args: Array<String>) {
    val myDonut = Donut("Custard", "Powdersugar")
    println(myDonut.eat())
    println(myDonut.name())
}