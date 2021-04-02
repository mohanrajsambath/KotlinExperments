package FuntionalKotlinBook.pack9Generics

fun main(args: Array<String>) {
    val mGenericObj: SampleGenericsClass<String> = SampleGenericsClass("Hello Generics")
    println("${mGenericObj.name}")
}