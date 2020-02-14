package FuntionalKotlinBook.Interface


class Cupcake(flavour: String) : BakeryGood(flavour), Bakeable {
    override fun bake(): String {
        return "is hot here, isn't??"
    }

    override fun name(): String {
        return "Cupcake!!"
    }
}

fun main(args: Array<String>) {
    val myBlueberryCupcake = Cupcake("Blueberry")
    val myAlmondCupcake = Cupcake("Almond")
    val myCheeseCupcake = Cupcake("Cheese")
    val myCaramelCupcake = Cupcake("Caramel")
    val definition = "However, it can extend many interfaces. An interface is a type that defines a behavior; in\n" +
            "the Bakeable interface's case, that is the bake() method."
    println("----CupCakes-----")
    println("----${definition}-----")

    println("1- ${myBlueberryCupcake.flavour} ${myBlueberryCupcake.name()}  flavour ${myBlueberryCupcake.bake()}")
    println("2- ${myAlmondCupcake.flavour} ${myAlmondCupcake.name()}  flavour ${myAlmondCupcake.bake()}")
    println("3- ${myCheeseCupcake.flavour} ${myCheeseCupcake.name()}  flavour ${myCheeseCupcake.bake()}")
    println("4- ${myCaramelCupcake.flavour} ${myCaramelCupcake.name()}  flavour ${myCaramelCupcake.bake()}")


}

