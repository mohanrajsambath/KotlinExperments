package FuntionalKotlinBook.pack5Abstract

/*Reference Url--https://www.programiz.com/kotlin-programming/abstract-class*/
abstract class Person(name: String) {
    var age: Int = 30

    fun displaySSN(ssn: Int) {
        println("My SSN is $ssn.")
    }

    abstract fun displayJob(description: String)
}