package Lecture._7_AbstractClass_AnimalApp

// Demonstrates abstract classes and polymorphism

fun main() {

    // The following would NOT compile because Animal is abstract.
    // val a = Animal(5, 10.0)

    val c = Cat(3, 4.5)
    val d = Dog(5, 12.0)

    // POLYMORPHISM: We can store Cat and Dog inside Animal references.
    val animals: List<Animal> = listOf(c, d)

    for (a in animals) {
        println(a.makeNoise())
    }

    /* Even though 'a' is typed as Animal, the correct overridden method is called.
        This is runtime polymorphism. */
}