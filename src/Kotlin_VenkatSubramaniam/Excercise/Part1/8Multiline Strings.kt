package Kotlin_VenkatSubramaniam.Excercise.Part1

fun demoMultiline() {
    println("----------Multiline Strings---------")
    /*The multiline string starts with three double quotes, contains the string
template expression to evaluate the variable name , and ends with three double
quotes. The output of this code is multiple lines of string with the embedded
expression evaluated.*/
    val name = "Mohan"
    val memo = """Dear $name, a quick reminder about the
party we have scheduled next Tuesday at
the 'Low Ceremony Cafe' at Noon. | Please plan to..."""
    println(memo)
    println("----------------Input Validated String--------------------------")
    println(createMemoFor(name))
    println("----------------Input Delimeter Trim Margin--------------------------")
    println(createMemoForDelimiter(name))
}

fun createMemoFor(name: String): String {
    if (name == "Mohan") {
        val memo = """Dear $name, a quick reminder about the
|party we have scheduled next Tuesday at
|the 'Low Ceremony Cafe' at Noon. | Please plan to..."""
        return memo
    }
    return ""
}

/*If you do not want to use | as the leading delimiter, because maybe your text
contains that character in arbitrary places, including the first character of
a new line, then you may choose some other character—for example, let’s
go ahead and choose ~ :*/

fun createMemoForDelimiter(name: String): String {
    if (name == "Mohan") {
        val memo = """Dear $name, a quick reminder about the
~party we have scheduled next Tuesday at
~the 'Low Ceremony Cafe' at Noon. | Please plan to..."""
        return memo.trimMargin("~")
    }
    return ""
}