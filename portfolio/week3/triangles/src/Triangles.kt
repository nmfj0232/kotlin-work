// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

fun isValidTriangle(triangle: Triangle): Boolean {

    val a = triangle.first
    val b = triangle.second
    val c = triangle.third

    return  a>0 && b>0 && c>0 &&
            a+b>c && a+c>b && b+c>a

}

fun triangleArea(triangle: Triangle): Double {
    require(isValidTriangle(triangle)){
        "Invalid Triangle"
    }

    val a = triangle.first
    val b = triangle.second
    val c = triangle.third

    val s = (a + b + c)/2

    return sqrt(s*(s-a)*(s-b)*(s-c))

}

