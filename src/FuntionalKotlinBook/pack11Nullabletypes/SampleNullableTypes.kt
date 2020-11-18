package FuntionalKotlinBook.pack11Nullabletypes

//import FuntionalKotlinBook.pack6Interface.Cupcake

import FuntionalKotlinBook.Pack8CompanionObject.Cupcake

fun eat(cupcake: Cupcake): Any {
    return "$cupcake"
}


fun main(args: Array<String>) {
    val myAlmondCupcake: Cupcake = Cupcake.almond()
    eat(myAlmondCupcake)
    //eat(null)
    myAlmondCupcake.eat()
}
