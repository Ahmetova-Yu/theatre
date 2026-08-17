package show

import person.Actor
import person.Director
import person.Person

class Ballet (
    title : String,
    duration : Int,
    director : Director,
    listOfActors : List<Actor>,
    musicAuthor : Person,
    librettoText : String,
    val choreographer : Person
) : MusicalShow (title, duration, director, listOfActors, musicAuthor, librettoText) {
}