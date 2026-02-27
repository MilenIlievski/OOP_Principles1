package Lecture._1_ClassAndObject_CatApp

// This file contains the Cat CLASS (the blueprint)
class Cat(val name: String, var age: Int, var weight: Int) {
    /* CLASS: A class is a blueprint for creating objects.
        Here, Cat is the blueprint for all cats we create.*/

    /* PRIMARY CONSTRUCTOR: The parameters (name, age, weight)
        are defined immediately after the class name.*/
    // We use val/var, they automatically become properties of the class.

    // METHOD: A function inside a class that describes behaviour.

    // METHOD: walk() - When a cat walks, it loses 1 unit of weight
    fun walk() {
        weight--
    }

    // METHOD: toString() returns a string representation of the object.
    // We use 'override' because all Kotlin classes already has a toString() method.
    override fun toString(): String {
        return "Name: $name Age: $age Weight: $weight"
    }
}