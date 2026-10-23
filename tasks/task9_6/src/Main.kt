// Task 9.6: application to compute dataset variance

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Implement main program here
    try {
        require(args.size == 1){
            "Please provide a filename on the command line"
        }

        val filename = args[0]
        val data = readData(filename)
        val result = variance(data)

        println("Dataset size: ${data.size}")
        println("Variance: %.5f".format(result))

    }   catch (e:Exception) {
        println("Error: ${e.message}")
        exitProcess(1)
    }


}
