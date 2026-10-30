// Task 12.4.1: main program
import kotlin.math.PI

fun main(){

    val centre = Point(0.0, 0.0)
    val circle = Circle(centre, 5.0)

    val point = Point(8.0, 9.0)

    println("Area: ${circle.area()}")
    println("Perimeter: ${circle.perimeter()}")

    if(circle contains point){
        println("Point is inside the circle")
    }else{
        println("Point is outside the circle")
    }


}
