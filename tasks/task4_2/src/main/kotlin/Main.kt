// Task 4.2: use of if and ranges

fun main() {

    println("PIZZA MENU")
    println()
    println("(a) Margherita")
    println("(b) Quattro Stagioni")
    println("(c) Seafood)"
    println("(d) Hawaiian")

    print("Choose your pizza (a-d) : " )
        val pizza = readln().lowercase()

            if ( pizza.length == 1 && pizza[0] in 'a..d') {
                println("Order accepted")
            }
                else{
                    println("Invalid choice!")
            }
}
