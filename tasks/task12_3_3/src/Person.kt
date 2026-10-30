import kotlinx.datetime.LocalDate

class Person(var name: String, val birthDate: String){
    var isMarried = false

    init{
        require(name.isNotBlank()) {"Name cannot be blank"}
    }

}
