package Kotlin_VenkatSubramaniam.Excercise.Part1

fun equalityCheck() {
    /*If these comparisons were done with equals() in Java, the net result would have
been a runtime NullPointerException , but Kotlin handles the null s safely.*/
    println("-----------Equality Check-----------") //10
    println("hi ==hi---=>${"hi" == "hi"}")
    println("hi ==Hi---=>${"hi" == "Hi"}")
    println("null ==hi---=>${null == "hi"}")
    println("hi ==null---=>${"hi" == null}")
    println("null ==null---=>${null == null}")

}