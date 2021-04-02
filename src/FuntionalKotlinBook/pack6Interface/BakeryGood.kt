package FuntionalKotlinBook.pack6Interface

abstract class BakeryGood(val flavour: String) {

    init {
        println("Preparing a new bakery good")
    }

    fun eat(): String {
        return "nom, nom, nom... delicious $flavour ${name()}"
    }

    /*fun bake(): String {
        return "is hot here, isn't??"
    }*/

    abstract fun name(): String
}

