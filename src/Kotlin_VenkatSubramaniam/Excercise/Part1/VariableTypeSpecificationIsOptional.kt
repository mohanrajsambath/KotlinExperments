package Kotlin_VenkatSubramaniam.Excercise.Part1

fun typeinference() {
    val greet = "Mohan"
    println(greet)
    //::class call is asking for the Kotlin class of the object referenced
    println(greet::class)
    //.javaClass call, however, is asking for the underlying Java class.
    println(greet.javaClass)
}