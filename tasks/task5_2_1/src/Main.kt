// Task 5.2.1: main program

import kotlin.system.exitProcess

fun main(args: Array<String>){
    if(args.size != 1) {
        println("Error : Number must be provided")
        exitProcess(1)
    }
        val number = args[0].toDouble()
        val area = circleArea(number)
        val perimeter = circlePerimeter(number)

        println("%.4f".format(area))
        println("%.4f".format(perimeter))

    }
