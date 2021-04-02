package Kotlin_VenkatSubramaniam.Excercise.Part1


fun typeinference() {
    println("-------Variable TypeSpecifications  Optional------")
    val greet = "Hello type inference"
    println(greet)
    //::class call is asking for the Kotlin class of the object referenced
    println(greet::class)
    //.javaClass call, however, is asking for the underlying Java class.
    println(greet.javaClass)
}

fun typechecking() {
    val greet = "hello type checking"
    println(greet)
    //Kotlin determined that the type of greet is String at compile time and, as a result.
    //So Comment the below line
    //greet = 0
}
