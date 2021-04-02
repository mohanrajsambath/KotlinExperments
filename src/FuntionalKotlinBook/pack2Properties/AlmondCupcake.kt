package FuntionalKotlinBook.pack2Properties

class AlmondCupcake {
    val flavour = "Almond"
}

fun main(args: Array<String>) {
    val mySecondCupcake = AlmondCupcake()
    println("My second has ${mySecondCupcake.flavour} flavour")
}