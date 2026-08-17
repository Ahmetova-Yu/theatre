package person

class Actor (
    name :String,
    surname :String,
    gender :Gender,
    val height :Int
   ) : Person(name, surname, gender) {
}