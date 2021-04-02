package Kotlin_VenkatSubramaniam.Excercise.Part1

fun escaped() {
    println("-------Escape String------")
    /*In an escaped string which starts and ends with a single double quote, we
can’t place a variety of characters, like new line or a double quote, for example,
without using the escape character \ . Even a simple case can be unpleasant
to read, like this one:*/
    val name = "Mohan"
    val escaped = "The kid asked, \"How's it going, $name?\""
    println("Escape String ---=>  $escaped")

    /*Instead of using escaped
strings, in Kotlin we use raw strings. Just like escaped strings, raw strings
can also be used as string templates*/
    val raw = """The kid asked, "How's it going, $name?""""
    println("Raw kotlin String ---=>  $raw")

}