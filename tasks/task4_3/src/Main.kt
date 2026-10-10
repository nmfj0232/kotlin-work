// Task 4.3: grade calculation using a when expression
import kotlin.math.roundToInt
import kotlin.system.exitProcess

fun main(args : Array<String>){

    if(args.size != 3) {
        println("Error: Marks for all three modules must be provided")
        exitProcess(1)
    }

    val a = args[0].toDouble()
    val b = args[1].toDouble()
    val c = args[2].toDouble()

    val averageMarks = ((a + b + c)/3).roundToInt()

    val grade = when (averageMarks) {
        in 70..100 -> "Distinction"
        in 40..69 -> "Passed"
        in 0..39 -> "Fail"
        else -> "Mark does not exist"
    }

        println("Average Marks = %.1f".format(averageMarks.toDouble()))
        println("Grade = $grade")

    }

