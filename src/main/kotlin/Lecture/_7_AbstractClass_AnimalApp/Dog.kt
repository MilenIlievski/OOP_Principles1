package Lecture._7_AbstractClass_AnimalApp

// Another CONCRETE subclass of Animal

class Dog(age: Int, weight: Double) : Animal(age, weight) {

    override fun makeNoise(): String {
        return "Woof!"
    }
}