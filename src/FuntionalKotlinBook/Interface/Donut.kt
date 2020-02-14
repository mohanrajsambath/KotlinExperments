package FuntionalKotlinBook.Interface

open class Donut(flavour: String, val topping: String) : BakeryGood(flavour), Fried {
    override fun name(): String {
        return "*swimming on Oil"
    }

    override fun fry(): String {
        return "dont with $topping topping"
    }

    /*val somethingFried = object : Fried {
        override fun fry(): String {
            return "TEST_3"
        }
    }*/
}


fun main(args: Array<String>) {
    val myDonut = Donut("Blueberry", "Custard")
    println("1- ${myDonut.flavour} ${myDonut.name()} ${myDonut.fry()} ")
    /*val somethingFried = object : Fried {
        override fun fry(): String {
            return "TEST_3"
        }
    }

    println("2- ${somethingFried}")*/

}