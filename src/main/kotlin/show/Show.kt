package show

import person.Actor
import person.Director

open class Show (
    val title :String,
    val duration :Int,
    val director : Director,
    val listOfActors: MutableList<Actor>)
{
    fun printInfoDirector() {
        print("Режиссер спектакля: ${director.toString()}")
    }

    fun pruntActors() {
        for (p in listOfActors) {
            print("${p.toString()} (${p.height})")
        }
    }

    fun addNewActor(newActor : Actor) {
        for (p in listOfActors) {
            if (p == newActor) {
                print("Актер уже есть в списке")
                return
            }
        }

        listOfActors.add(newActor)
        print("Актер успешно добавлен!")
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
}