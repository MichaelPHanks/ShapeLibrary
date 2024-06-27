package org.example

abstract class Shape
{
    abstract fun move(deltaX: Double, deltaY: Double)
    abstract fun area() : Double

    // NOTE: Need to fix UML diagram to have deltaX and deltaY types for this class and line.
}


class Point(private var x: Double, private var y: Double)
{
    fun moveX(deltaX: Double)
    {
        x += deltaX
    }
    fun moveY(deltaY: Double)
    {
        y += deltaY
    }

    fun getX(): Double
    {
        return this.x
    }
    fun getY(): Double
    {
        return this.y
    }


}

// TODO: Functionality for moving only one point?
class Line(private var point1: Point, private var point2: Point)
{
    fun slope() : Double
    {
        TODO("Implement slope from point1 to point2")
    }

    fun length(): Double
    {
        TODO("Implement length from point1 to point2")
    }

    fun move(deltaX: Double, deltaY: Double)
    {
        point1.moveX(deltaX)
        point1.moveY(deltaY)
        point2.moveX(deltaX)
        point2.moveY(deltaY)
    }
}


class Triangle(private var point1: Point, private var point2: Point, private var point3: Point) : Shape() {


    override fun move(deltaX: Double, deltaY: Double) {
        TODO("Not yet implemented")
    }

    override fun area(): Double {
        TODO("Not yet implemented")
    }


}

// NOTE: radiusX & radiusY seem improper for this class, if we can rotate objects. If not, this should be fine.
class Ellipse(private var center: Point, private var radiusX: Double, private var radiusY: Double) : Shape(){


    override fun move(deltaX: Double, deltaY: Double) {
        TODO("Not yet implemented")
    }

    override fun area(): Double {
        TODO("Not yet implemented")
    }
}


class Circle(private var center: Point, private var radius: Double): Shape(){

    override fun move(deltaX: Double, deltaY: Double) {
        TODO("Not yet implemented")
    }

    override fun area(): Double {
        TODO("Not yet implemented")
    }
}


class Square(private var topRightPoint: Point, private var bottomLeftPoint: Point) : Shape(){

    override fun move(deltaX: Double, deltaY: Double) {
        TODO("Not yet implemented")
    }

    override fun area(): Double {
        TODO("Not yet implemented")
    }
}


class Rectangle(private var topRightPoint: Point, private var bottomLeftPoint: Point) : Shape(){


    override fun move(deltaX: Double, deltaY: Double) {
        TODO("Not yet implemented")
    }

    override fun area(): Double {
        TODO("Not yet implemented")
    }
}






