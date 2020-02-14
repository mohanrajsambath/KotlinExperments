package FuntionalKotlinBook.pack7Objects

import FuntionalKotlinBook.pack6Interface.Bakeable
import FuntionalKotlinBook.pack6Interface.Cupcake

//Object declarations
object Oven {
    fun process(product: Bakeable) {
        println(product.bake())
    }
}

fun main(args: Array<String>) {
    val myAlmondCupcake = Cupcake("Almond")
    Oven.process(myAlmondCupcake)
}