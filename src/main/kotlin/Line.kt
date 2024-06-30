package org.example

import kotlin.math.pow
import kotlin.math.sqrt

class Line(private var start: Point, private var end: Point) : Moveable
{

    init {
        require(start.getX() != end.getX() || start.getY() != end.getY())
    }

    fun getStart(): Point
    {
        return this.start
    }

    fun getEnd(): Point
    {
        return this.end
    }

    fun slope() : Double
    {

        return (start.getY() - end.getY()) / (start.getX() - end.getX())
    }

    fun length(): Double
    {
        return sqrt((start.getX() - end.getX()).pow(2.0) + (start.getY() - end.getY()).pow(2.0))
    }

    override fun move(deltaX: Double, deltaY: Double) {
        start.move(deltaX, deltaY)
        end.move(deltaX, deltaY)
    }


}
