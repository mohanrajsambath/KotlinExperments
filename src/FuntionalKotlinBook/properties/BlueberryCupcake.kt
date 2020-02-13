package FuntionalKotlinBook.properties

class BlueberryCupcake {
    var flavour = "Blueberry"
}

fun main(args: Array<String>) {
//Properties
    val myCupcake = BlueberryCupcake()
    println("My cupcake has ${myCupcake.flavour}")
    myCupcake.flavour = "Almond"
    println("My cupcake has ${myCupcake.flavour}")
}