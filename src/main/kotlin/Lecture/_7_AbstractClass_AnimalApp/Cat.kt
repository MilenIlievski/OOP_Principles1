package Lecture._7_AbstractClass_AnimalApp

// CONCRETE subclass of Animal

/* Cat inherits from Animal.
    Because Animal has an abstract method, Cat MUST override makeNoise(). */

class Cat(age: Int, weight: Double) : Animal(age, weight) {

    override fun makeNoise(): String {
        return "Meow!"
    }
}