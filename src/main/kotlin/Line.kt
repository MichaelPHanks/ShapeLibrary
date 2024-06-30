package org.example

// TODO: Functionality for moving only one point?
class Line(private var point1: Point, private var point2: Point) : Moveable
{

    init {
        require(validateShape(point1, point2))
    }
    private fun validateShape(point1: Point, point2: Point): Boolean
    {
        return point1.getX() != point2.getX()
    }
    fun slope() : Double
    {
        TODO("Implement slope from point1 to point2")
    }

    fun length(): Double
    {
        TODO("Implement length from point1 to point2")
    }

    override fun move(deltaX: Double, deltaY: Double) {
        TODO("Not yet implemented")
    }


}
