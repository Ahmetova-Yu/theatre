package person

import java.util.Objects

open class Person (
    val name :String,
    val surname :String,
    val gender :Gender
) {
    override fun toString(): String {
        return "$name $surname"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Person) return false
        return name == other.name && surname == other.surname
    }

    override fun hashCode(): Int {
        var res = name.hashCode()
        res = 31 * res + surname.hashCode()
        return res
    }
}