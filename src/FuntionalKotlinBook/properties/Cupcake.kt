package FuntionalKotlinBook.properties

class Cupcake(val flavour: String)

fun main(args: Array<String>) {
    val myBlueberryCupcake = Cupcake("Blueberry")
    val myAlmondCupcake = Cupcake("Almond")
    val myCheeseCupcake = Cupcake("Cheese")
    val myCaramelCupcake = Cupcake("Caramel")
    val definition = "Cupcake class has a constructor with a parameter, flavour , that is assigned to a flavour value."
    println("----CupCakes-----")
    println("----${definition}-----")

    println("1- ${myBlueberryCupcake.flavour} flavour")
    println("2- ${myAlmondCupcake.flavour} flavour")
    println("3- ${myCheeseCupcake.flavour} flavour")
    println("4- ${myCaramelCupcake.flavour} flavour")
}