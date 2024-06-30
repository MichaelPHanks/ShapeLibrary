package org.example

class Point(private var X: Double, private var Y: Double) : Moveable
{


    fun getX(): Double
    {
        return this.X
    }
    fun getY(): Double
    {
        return this.Y
    }

    override fun move(deltaX: Double, deltaY: Double) {
        X += deltaX
        Y += deltaY
    }


}
