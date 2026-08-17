package person

import java.util.Objects

open class Person (
    val name :String,
    val surname :String,
    val gender :Gender
) {
    override fun toString(): String {
        return "$name $gender"
    }

    override fun equals(other: Any?): Boolean {
        if (this == other) return true
        if (other !is Person) return false
        return name == other.name && surname == other.surname
    }

    override fun hashCode(): Int {
        return Objects.hash(name, surname)
    }
}