import kotlinx.datetime.LocalDate

fun main(){


    val marriedPerson = Person("   ", "2005-10-14").apply {
        isMarried = true
    }
    println(marriedPerson.name)
    println(marriedPerson.birthDate)
    println(marriedPerson.isMarried)
}

