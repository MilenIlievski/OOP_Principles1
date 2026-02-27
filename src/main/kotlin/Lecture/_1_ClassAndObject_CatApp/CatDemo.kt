package Lecture._1_ClassAndObject_CatApp

// This file demonstrates OBJECT creation and usage
fun main() {

    // OBJECT: An object is a specific instance of a class.

    // Here, binnie and clyde are objects of the Cat class.
    // We are calling the CONSTRUCTOR to create them.

    val binnie = Cat("Binnie", 10, 10)
    val clyde = Cat("Clyde", 5, 5)

    // Calling a METHOD on each object
    binnie.walk()
    clyde.walk()

    /* println(objectName)
        automatically calls the toString() method
        to determine how the object should be displayed. */

    println(binnie)
    println(clyde)
}