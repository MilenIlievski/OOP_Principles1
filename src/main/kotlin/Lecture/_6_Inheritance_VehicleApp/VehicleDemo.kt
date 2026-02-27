package Lecture._6_Inheritance_VehicleApp

// Demonstrates inheritance and overriding
fun main() {

    val c = Car("Ford", 120, 2000)
    val b = Bike("Raleigh", 30, true, 27)

    println(c)
    println(b)

    /* POLYMORPHISM BEHAVIOUR:
        - Car has overridden move()
        - Bike has NOT overridden move() */

    c.move()   // Car version (engine stopped)
    c.start()
    c.move()   // Car version (engine running)
    c.stop()

    b.move()   // Vehicle version
}