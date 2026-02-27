package Lecture._5_MethodParameters_CatApp

// Demonstrates passing ARGUMENTS to a method
fun main() {

    val sniffy = Cat("Sniffy", 10, 15)

    /* ARGUMENT vs PARAMETER:
        distance (in Cat class) → PARAMETER
        5 and 3 below → ARGUMENTS */

    sniffy.walk(5)     // 5 is an argument
    println(sniffy)

    sniffy.walk(3)     // 3 is another argument
    println(sniffy)

    // We could also check success/failure:
        println(if (sniffy.walk(3)) "Walk successful" else "Walk failed")
}