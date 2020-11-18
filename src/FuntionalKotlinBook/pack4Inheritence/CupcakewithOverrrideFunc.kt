package FuntionalKotlinBook.pack4Inheritence

class CupcakewithOverrrideFunc(flavour: String) : BakeryGoodOverrideFunc(flavour) {
    override fun name(): String {
        return "Cupcake"
    }
}

fun main(args: Array<String>) {
    val myBakeryGoodOverrideFuncFunc: BakeryGoodOverrideFunc = CupcakewithOverrrideFunc("Cinnamon")
    println(myBakeryGoodOverrideFuncFunc.eat())
    println(myBakeryGoodOverrideFuncFunc.name())
}