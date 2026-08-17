package show

import person.Actor
import person.Director
import person.Gender

open class Show (
    val title :String,
    val duration :Int,
    val director : Director,
    val listOfActors: MutableList<Actor>
) {
    init {
        require(listOfActors.isNotEmpty()) { "Спектакль должен содержать хотя бы 1 актера" }
    }

    fun printDirectorInfo() {
        print("Режиссер спектакля: ${director.toString()}")
    }

    fun printActors() {
        listOfActors.forEach { actor ->
            println("$actor (${actor.height} см)")
        }
    }

    fun addNewActor(newActor : Actor) {
        if (listOfActors.contains(newActor)) {
            println("$newActor уже есть в спектакле")
            return
        }

        listOfActors.add(newActor)
        val adding = when (newActor.gender) {
            Gender.MALE -> " добавлен"
            else -> " добавлена"
        }
        println("$newActor $adding в спектакль!")
    }

    fun replaceActor(newActor: Actor, oldActor: Actor) {
        val index = listOfActors.indexOfFirst { it == oldActor }

        if (index != -1) {
            listOfActors[index] = newActor
            println("Актер успешно заменен")
        } else {
            println("Актера ${oldActor.toString()} нет в списке")
        }
    }

    override fun toString(): String {
        val actorsString = listOfActors.joinToString(separator = ", ") { it.toString() }
        return "Спектакль: '$title', Длительность: $duration мин, Режиссер: ${director.toString()}, Актеры: $actorsString"
    }
}