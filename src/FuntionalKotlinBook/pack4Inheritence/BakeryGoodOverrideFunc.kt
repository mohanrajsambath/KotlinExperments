package FuntionalKotlinBook.pack4Inheritence

open class BakeryGoodOverrideFunc(val flavour: String) {
    fun eat(): String {
        return "nom, nom, nom... delicious $flavour bakery good"
    }

    open fun name(): String {
        return "bakery good"
    }
}

/*
class Cupcake(flavor: String): BakeryGood(flavor)
class Biscuit(flavor: String): BakeryGood(flavor)*/
