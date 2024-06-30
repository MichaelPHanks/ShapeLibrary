package org.example

import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sqrt

class Square(private var topRightPoint: Point, private var bottomLeftPoint: Point) : Shape()
{
    init {
        require(validateSquare(topRightPoint, bottomLeftPoint))
    }

    private fun validateSquare(point1: Point, point2: Point): Boolean
    {
        return (topRightPoint.getX() != bottomLeftPoint.getX() && topRightPoint.getY() != bottomLeftPoint.getY()) &&
       abs((point1.getX() - point2.getX())) == abs(point1.getY() - point2.getY())

    }


    override fun area(): Double {
        return (abs(topRightPoint.getX() - bottomLeftPoint.getX()).pow(2.0))
    }

    override fun move(deltaX: Double, deltaY: Double) {
        topRightPoint.move(deltaX, deltaY)
        bottomLeftPoint.move(deltaX, deltaY)
    }
}