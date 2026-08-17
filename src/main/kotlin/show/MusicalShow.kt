package show

import person.Actor
import person.Director
import person.Person

open class MusicalShow (
    title : String,
    duration : Int,
    director : Director,
    listOfActors : MutableList<Actor>,
    val musicAuthor : Person,
    val librettoText : String
) : Show (title, duration, director, listOfActors) {

    fun printLibretto() {
        println("Либретто: $librettoText")
    }

    override fun toString(): String {
        return super.toString() + ", Музыка: ${musicAuthor.name} ${musicAuthor.surname}, Либретто: '$librettoText'"
    }
}