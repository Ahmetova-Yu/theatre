package show

import person.Actor
import person.Director
import person.Person

open class MusicalShow (
    title : String,
    duration : Int,
    director : Director,
    listOfActors : List<Actor>,
    val musicAuthor : Person,
    val librettoText : String

    ) : Show (title, duration, director, listOfActors) {
}