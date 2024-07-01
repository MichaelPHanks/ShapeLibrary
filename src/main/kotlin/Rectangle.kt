package org.example

import kotlin.math.abs

class Rectangle(private var topRightPoint: Point, private var bottomLeftPoint: Point) : Shape()
{
    init {
        require(topRightPoint.getX() != bottomLeftPoint.getX() && topRightPoint.getY() != bottomLeftPoint.getY())
    }

    fun getTopRightPoint(): Point = this.topRightPoint
    fun getBottomLeftPoint(): Point = this.bottomLeftPoint


    override fun move(deltaX: Double, deltaY: Double) {
        topRightPoint.move(deltaX, deltaY)
        bottomLeftPoint.move(deltaX, deltaY)
    }

    override fun area(): Double {
        return abs((topRightPoint.getX() - bottomLeftPoint.getX()) * (topRightPoint.getY() - bottomLeftPoint.getY()))
    }
}
