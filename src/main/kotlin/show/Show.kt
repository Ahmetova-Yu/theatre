package show

import person.Actor
import person.Director

open class Show (
    val title :String,
    val duration :Int,
    val director : Director,
    val listOfActors: List<Actor>
  ) {

}