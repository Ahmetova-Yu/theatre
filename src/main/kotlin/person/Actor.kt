package person

import java.util.Objects

class Actor (
    name :String,
    surname :String,
    gender :Gender,
    val height :Int
) : Person(name, surname, gender) {

    override fun toString(): String {
        return super.toString() + " ($height см)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Actor) return false
        if (!super.equals(other)) return false
        return height == other.height
    }

    override fun hashCode(): Int {
        var res = super.hashCode()
        res = 31 * res + height
        return res
    }
}