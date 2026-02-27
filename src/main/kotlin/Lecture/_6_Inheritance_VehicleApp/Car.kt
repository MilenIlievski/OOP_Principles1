package Lecture._6_Inheritance_VehicleApp

// SUBCLASS of Vehicle

/* Inheritance syntax: class Car(...) : Vehicle(...)
    The colon (:) means Car inherits from Vehicle.
    We must call the Vehicle constructor and pass the values it requires. */

class Car(make: String, topSpeed: Int, private val engineCapacity: Int) : Vehicle(make, topSpeed, 4) {        // Cars always have 4 wheels

    private var engineRunning = false

    // METHOD OVERRIDING: We override the Vehicle version of move().
    // The override keyword is required.

    override fun move() {
        if (engineRunning) {
            println("Driving along...")
        } else {
            println("Can't drive the car if the engine's stopped!!!")
        }
    }

    // Car-specific behaviour
    fun start() {
        engineRunning = true
    }

    fun stop() {
        engineRunning = false
    }

    /* super.toString(): Calls the superclass version of toString()
        and extends it with Car-specific information. */
    override fun toString(): String {
        return super.toString() +
                " Engine running? $engineRunning, Engine Capacity: $engineCapacity"
    }
}