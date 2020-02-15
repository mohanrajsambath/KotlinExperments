package FuntionalKotlinBook.Pack8CompanionObject

import FuntionalKotlinBook.pack6Interface.Bakeable
import FuntionalKotlinBook.pack6Interface.BakeryGood

class Cupcake(flavour: String) : BakeryGood(flavour), Bakeable {
    override fun name(): String {
        return "Cupcake"
    }

    companion object {
        fun almond(): Cupcake {
            return Cupcake("Almond")
        }

        fun cheese(): Cupcake {
            return Cupcake("Cheese")
        }
    }
}

fun main(args: Array<String>) {
    /*val mBlueberryCupcake:BakeryGood = Cupcake("Blueberry")
    val mAlmondCupcake = Cupcake.almond()
    val mCheeseCupcake = Cupcake.cheese()
    val mCaramelCupcake = Cupcake("Caramel")

    println("${mBlueberryCupcake}")
    println("${mAlmondCupcake}")
    println("${mCheeseCupcake}")
    println("${mCaramelCupcake}")*/

    val factory: Cupcake.Companion = Cupcake.Companion
    println("${factory}")
}