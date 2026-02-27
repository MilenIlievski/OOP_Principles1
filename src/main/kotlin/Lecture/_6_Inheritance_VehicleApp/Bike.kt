package Lecture._6_Inheritance_VehicleApp

// Another SUBCLASS of Vehicle
class Bike(make: String, topSpeed: Int, private val isOffRoad: Boolean, private val nGears: Int)
    : Vehicle(make, topSpeed, 2) {          // Bikes always have 2 wheels

    // We DO NOT override move() here. Therefore Bike uses the original Vehicle version of move().

    override fun toString(): String {
        return super.toString() +
                " Off road? $isOffRoad, No. Gears: $nGears"
    }
}