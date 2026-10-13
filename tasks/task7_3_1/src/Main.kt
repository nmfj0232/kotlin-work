// Task 7.3.1: list element access

fun main(){
    val numbers = listOf(9, 3, 6, 2, 8, 5)
    println(numbers)

    println(numbers[4])
    println(numbers.slice(2..4))
    println(numbers.first())
    println(numbers.last())
    println(numbers.add(1))

}
