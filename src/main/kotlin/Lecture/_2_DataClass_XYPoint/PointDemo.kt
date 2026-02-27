package Lecture._2_DataClass_XYPoint

// This file demonstrates OBJECT creation and usage
fun main() {

    // p1 and p2 are objects (instances) of the Point data class.
    // We are calling the CONSTRUCTOR to initialise the objects.

    val p1 = Point(0, 5)
    val p2 = Point(5, 2)

    // Accessing PROPERTIES
    println("Point 1 -> x: ${p1.x}, y: ${p1.y}")
    println("Point 2 -> x: ${p2.x}, y: ${p2.y}")

    // toString() is automatically generated in a data class.
    // So printing the object directly gives a structured output.
    println(p1)
    println(p2)

    // equals() is also automatically generated.
    println("Are points equal? ${p1 == p2}")

    // copy() function is automatically available.
    val p3 = p1.copy(y = 10)
    println("Copied Point -> $p3")
}