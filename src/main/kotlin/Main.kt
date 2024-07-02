package org.example

fun main() {
    println("Hello World!")
    val point1 = Point(1.0,2.0)
    val point2 = Point(1.1,2.5)
    val point3 = Point(2.0, 4.0)
    val shapes = listOf<Shape>(Rectangle(point1, point2), Triangle(point1, point2, point3), Ellipse(point1, 15.0, 1.1))

    for (shape in shapes)
    {
        println(shape.area())
    }

}