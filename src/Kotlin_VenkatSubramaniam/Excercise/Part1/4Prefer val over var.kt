package Kotlin_VenkatSubramaniam.Excercise.Part1

fun immutate() {
    println("-------Prefer val over var------")
    /*To define an immutable variable–that is, a constant or a value—use val , like so:*/
    val pi: Double = 3.14

/*Either way, the value of pi can’t be modified; val is like final in Java. Any attempt
to change or reassign a value to variables defined using val will result in a
compilation error. For example, the following code isn’t valid:*/

    val radc: Double = 3.14
//radc=3.14 //ERROR: val cannot be reassigned // So i Comment it
    println("Value assigned to Immutable variable  pi=${pi}")
}

fun mutate() {
    var score = 10
    //or var score: Int = 10
    println("Value default assigned to mutable variable  score=${score}") //10
    score = 11
    println("Value assigned to mutable variable  score=${score}") //11

    var factor = 2
    fun doubleIt(n: Int) = n * factor
    factor = 0
    println("Value assigned to mutable variable  factor=${doubleIt(2)}")
}

