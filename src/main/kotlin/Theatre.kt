import person.*
import show.*

fun main() {
    println("Создание актеров, режиссеров и др персон")

    val actor1 = Actor("Мария", "Васильева", Gender.FEMALE, 168)
    val actor2 = Actor("Денис", "Леонов", Gender.MALE, 187)
    val actor3 = Actor("Анастасия", "Потапова", Gender.FEMALE, 170)
    val actor4 = Actor("Егор", "Анисимов", Gender.MALE, 190)
    val actor5 = Actor("Денис", "Леонов", Gender.MALE, 187) // дубликат

    val director1 = Director("Валерий", "Зайцев", Gender.MALE, 6)
    val director2 = Director("Тимофей", "Кукунин", Gender.MALE, 15)

    val dancer = Person("Елена", "Тимофеева", Gender.FEMALE)
    val musician = Person("Ольга", "Владимирова", Gender.FEMALE)

    println("\nСоздание спектаклей")

    val show = Show(
        "Обычный спектакль!",
        120,
        director2,
        mutableListOf(actor2)
    )

    val opera = Opera(
        title = "Опера!",
        duration = 80,
        director = director2,
        listOfActors = mutableListOf(actor3, actor5),
        musicAuthor = musician,
        librettoText = "Композитор, теряющий слух, в отчаянии пишет симфонию, находя вдохновение в любви",
        choirSize = 4
    )

    val ballet = Ballet(
        title = "Балет",
        duration = 140,
        director = director1,
        listOfActors = mutableListOf(actor2, actor1),
        musicAuthor = musician,
        librettoText = "Порыв ветра уносит шарф балерины к скрипачу. Их взгляды встречаются, и рождается танец на мосту под дождем",
        choreographer = dancer
    )

    println("\n" + "-".repeat(50))
    println("Добавление актеров в спектакли:")
    show.addNewActor(actor1)
    show.addNewActor(actor1) // дубликат
    ballet.addNewActor(actor3)
    println("-".repeat(50))

    println("Вывод информации об актерах:")
    println(show)
    println(opera)
    println(ballet)
    println("-".repeat(50))

    println("Замена актера:")
    opera.replaceActor(actor2, actor3)
    println(opera)
    println("-".repeat(50))

    println("Замена актера на несуществующего:")
    opera.replaceActor(actor1, actor4)
    println(opera)
    println("-".repeat(50))

    println()
    print("Либретто '${opera.title}': ")
    opera.printLibretto()
    print("Либретто '${ballet.title}': ")
    ballet.printLibretto()
}