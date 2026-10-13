// Task 5.1.2: main program

import kotlin.system.exitProcess

fun main (args : Array<String>) {
    if (args.size != 1) {
        println("Error: Command line must be presented")
        exitProcess(1)
    }

    val number = args[0].toInt()
    rollDie(number)
}