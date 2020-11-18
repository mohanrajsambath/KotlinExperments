package FuntionalKotlinBook.pack2Properties

class BlueberryCupcake {
    var flavour = "Blueberry"
}

fun main(args: Array<String>) {
//Properties
    val myCupcake = BlueberryCupcake()
    println("My cupcake has ${myCupcake.flavour}")
    myCupcake.flavour = "Almond-1"
    myCupcake.flavour = "Almond-2"
    println("My cupcake has ${myCupcake.flavour}")
}