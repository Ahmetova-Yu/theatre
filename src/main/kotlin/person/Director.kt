package person

class Director (
    name :String,
    surname :String,
    gender :Gender,
    val numberOfShows :Int
   ) : Person(name, surname, gender) {

    override fun toString(): String {
        return super.toString() + " постановок: $numberOfShows"
    }
}