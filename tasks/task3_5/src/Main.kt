// Task 3.5: simple file I/O

import kotlin.io.path.Path
import kotlin.io.path.appendText
import kotlin.io.path.readText
import kotlin.io.path.writeText

fun main() {

    val filePath = Path ("test.txt")
    filePath.appendText("cupapi alakungko")
    filePath.appendText ("alabombo")

    val fileContents = filePath.readText()
    println(fileContents)
}

