package show

import person.Actor
import person.Director
import person.Person

class Opera (title : String,
             duration : Int,
             director : Director,
             listOfActors : MutableList<Actor>,
             musicAuthor : Person,
             librettoText : String,
             val choirSize : Int
) : MusicalShow (title, duration, director, listOfActors, musicAuthor, librettoText) {

    override fun toString(): String {
        return super.toString() + ", Размер хора: $choirSize"
    }
}