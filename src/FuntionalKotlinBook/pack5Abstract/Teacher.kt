package FuntionalKotlinBook.pack5Abstract

/*Reference Url--https://www.programiz.com/kotlin-programming/abstract-class*/
class Teacher(name: String) : Person(name) {
    override fun displayJob(description: String) {
        println(description)
    }
}

fun main(args: Array<String>) {
    val shobana = Teacher("Shobana")
    shobana.displayJob("I',m a Computer Teacher")
    shobana.displaySSN(17061990)

}