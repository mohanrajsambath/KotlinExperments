package Kotlin_VenkatSubramaniam.Excercise.Part1

fun unused() {
    println("-------Sensible Warning------")
    println(
        "the\n" +
                "parameter passed to compute(0) isn’t used  by function, it have default value--=>${compute(0)}"
    )
}

/*if a parameter that’s received in a function or a method isn’t
used, then the compiler will give a warning. In the following script, the
parameter passed to compute() isn’t used.*/
fun compute(n: Int) = 4
