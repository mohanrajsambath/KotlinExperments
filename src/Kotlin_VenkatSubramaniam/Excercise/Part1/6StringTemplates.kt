package Kotlin_VenkatSubramaniam.Excercise.Part1

fun stringtemplate() {
    println("-------String Templates------")
    /*Within a double-quoted string, the $ symbol can prefix any variable to turn
     that into an expression. If the expression is more complex than a simple
     variable, then wrap the expression with ${} .*/
    val price = 12.25
    val taxRate = 0.08
    val output = "The amount $price after tax comes to $${price * (1 + taxRate)}"
    val disclaimer = "The amount is in US$, that's right in \$only"

    println(output)
    println(disclaimer)

}

fun mutateconfusion() {
    println("-------Mutate Confusion------")
    var factor = 2
    fun doubleIt(n: Int) = n * factor
    var message = "The factor is $factor"
    factor = 0
    println("Value assigned to mutable variable  factor=${doubleIt(2)}")
    println(message)
}