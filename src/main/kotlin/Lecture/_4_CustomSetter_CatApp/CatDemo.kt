package Lecture._4_CustomSetter_CatApp

// This file demonstrates how the custom setter works
fun main() {

    // OBJECT CREATION: sniffy is an object of the Cat class.
    val sniffy = Cat("Sniffy", 5, 7)

    // Accessing the public property
    println("Initial weight: ${sniffy.weight}")

    // Setting weight to a valid value (>= 5). This will succeed.
    sniffy.weight = 6
    println("After setting to 6: ${sniffy.weight}")

    // Setting weight to an invalid value (< 5). This will be ignored by the custom setter.
    sniffy.weight = 4
    println("After attempting to set to 4: ${sniffy.weight}")

    // The weight remains 6 because the setter prevented invalid modification.
}