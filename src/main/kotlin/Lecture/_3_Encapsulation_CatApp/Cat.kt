package Lecture._3_Encapsulation_CatApp

// This file contains the Cat CLASS (the blueprint)
class Cat(private val name: String, private var age: Int, var weight: Int) {

    /* ENCAPSULATION: The properties are PRIVATE, so they cannot be accessed from outside the class.
        This keeps the internal state hidden from other code and prevents corruption. */

    /*  PRIVATE: Can be accessed only inside this class.
        PUBLIC: Can be accessed inside and outside the class.
        - In Kotlin, public is the default, so we can omit it. */

    // METHODS are the gateway to use the class.

    /*  walk() is PUBLIC, so code outside the class can call it.
        walk() controls how weight changes (so weight cannot become unrealistic).
        Returning Boolean is better than printing because it gives flexibility
        to the code using this class (console app, GUI app, Android app, etc.) */

    fun walk(): Boolean {
        if (weight > 5) {
            weight--
            return true
        }
        return false
    }

    /* toString(): We RETURN a String rather than printing inside the class.
        This is more flexible: the calling code decides how to display it
        (println, GUI label, Android TextView, logging, etc.) */

    override fun toString(): String {
        return "Name: $name, age: $age, weight: $weight"
    }
}