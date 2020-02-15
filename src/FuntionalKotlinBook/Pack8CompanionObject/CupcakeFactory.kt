package FuntionalKotlinBook.Pack8CompanionObject

import FuntionalKotlinBook.pack6Interface.Bakeable
import FuntionalKotlinBook.pack6Interface.BakeryGood

class CupcakeFactory(flavour: String) : BakeryGood(flavour), Bakeable {
    override fun name(): String {
        return "CupCake.."
    }

    companion object Factory {
        fun almond(): CupcakeFactory {
            return CupcakeFactory("Almond")
        }

        fun cheese(): CupcakeFactory {
            return CupcakeFactory("Cheese")
        }
    }
}

fun main(args: Array<String>) {
    val factory: CupcakeFactory.Factory = CupcakeFactory.Factory
    val factoryAlmondCupcake = factory.almond()
    val factoryCheeseCupcake = factory.cheese()
    println("${factoryAlmondCupcake}")
    println("${factoryAlmondCupcake}")


}