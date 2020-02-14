package FuntionalKotlinBook.pack7Objects

import FuntionalKotlinBook.pack6Interface.Bakeable
import FuntionalKotlinBook.pack6Interface.Cupcake

object ElectricOven : OvenInterface {
    override fun process(product: Bakeable) {
        println(product.bake())
    }
}

fun main(args: Array<String>) {
    val myAlmondCupcake = Cupcake("Almond")
    ElectricOven.process(myAlmondCupcake)
}