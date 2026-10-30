// Task 12.3.2: demo of Person class with secondary constructor
import kotlinx.datetime.LocalDate

fun main(){


    val marriedPerson = Person("Joe", "2005-10-14").apply {
        isMarried = true
    }
    println(marriedPerson.name)
    println(marriedPerson.birthDate)
    println(marriedPerson.isMarried)
}