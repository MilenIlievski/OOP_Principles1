package Lecture._3_Encapsulation_CatApp

// This file demonstrates OBJECTS and encapsulation behaviour
fun main() {

    /* sniffy is an OBJECT (instance) of the Cat class.
        We create it by calling the constructor. */
    val sniffy = Cat("Sniffy", 5, 7)

    // We can print the object directly. println(object) automatically uses toString()
    println(sniffy)

    /* Calling walk() multiple times:
        walk() returns true/false instead of printing messages.
        This allows the MAIN program to decide what to do with the result.
        In a GUI app, you could show a popup instead of printing. */
    for (i in 1..3) {
        println(if (sniffy.walk()) "Walk successful" else "Walk failed")
    }

    // Show final state
    println(sniffy)

    /* IMPORTANT (ENCAPSULATION):
        The following line would NOT compile because weight is PRIVATE.
        This prevents outside code from setting unrealistic values like -1 */

    // sniffy.weight = -1
}