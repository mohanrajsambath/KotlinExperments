package Kotlin_VenkatSubramaniam.Excercise.Part1


fun standalone() {
    println("-------Class and Functions are Optional------")
    println("not in a function, calling nofluff()")
    try {
        nofluff()
    } catch (ex: Exception) {
        val stackTrace = ex.getStackTrace()
        println(stackTrace[0])
        println(stackTrace[1])
    }
}


fun nofluff() {
    println("nofluff called...")
    throw RuntimeException("oops")
}

fun noCatch() {
    println("Lemme take a nap")
    Thread.sleep(1000)
    println("ah that feels good")
}


