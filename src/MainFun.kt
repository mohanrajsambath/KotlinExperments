fun main(args: Array<String>) {
    println("Hello Kotlin World")
    val mHello = Helloworld()
    mHello.doPrintHello()

    //Properties
    val myCupcake = BlueberryCupcake()
    println("My cupcake has ${myCupcake.flavour}")
    myCupcake.flavour = "Almond"
    println("My cupcake has ${myCupcake.flavour}")
}