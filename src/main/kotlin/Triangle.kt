package org.example

import kotlin.math.abs

class Triangle(private var point1: Point, private var point2: Point, private var point3: Point) : Shape() {

    init {
        require(0.5 * abs(point1.getX() * (point2.getY() - point3.getY()) + point2.getX() * (point3.getY() - point1.getY()) + point3.getX() * (point1.getY() - point2.getY())) > 0)
    }

    fun getPoint1() : Point = point1
    fun getPoint2() : Point = point2
    fun getPoint3() : Point = point3

    override fun move(deltaX: Double, deltaY: Double) {
        this.point1.move(deltaX, deltaY)
        this.point2.move(deltaX, deltaY)
        this.point3.move(deltaX, deltaY)
    }

    override fun area(): Double = 0.5 * abs(point1.getX() * (point2.getY() - point3.getY()) + point2.getX() * (point3.getY() - point1.getY()) + point3.getX() * (point1.getY() - point2.getY()))


}
