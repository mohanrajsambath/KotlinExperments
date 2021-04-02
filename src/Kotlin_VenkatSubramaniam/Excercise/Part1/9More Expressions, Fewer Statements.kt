package Kotlin_VenkatSubramaniam.Excercise.Part1

fun moreExpressionFewerStatements() {
    println("----------MoreExpression FewerStatements---------")
    println("Vote Pooling Status---=>${canVote("Mohan", 31)}")
    println("Vote Pooling Status---=>${canVote("Prem", 16)}")

}

fun canVote(name: String, age: Int): String {
    /*We were able to use val instead of var since we’re not mutating a variable. And
we were able to use type inference for status , since the value is known from
the if expression. The code is less noisy and less error prone as well.*/
    val status = if (age > 17) "yes, please vote" else "nope, please come back"
    return "$name, $status"
}