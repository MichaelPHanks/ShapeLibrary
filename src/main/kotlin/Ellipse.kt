package org.example

class Ellipse(private var center: Point, private var radiusX: Double, private var radiusY: Double) : Shape(){

    init {
        require(Math.PI * radiusX * radiusY > 0)
    }

    fun getCenter(): Point = center
    fun getRadiusX(): Double = radiusX
    fun getRadiusY(): Double = radiusY

    override fun move(deltaX: Double, deltaY: Double) {
        this.center.move(deltaX, deltaY)
    }

    override fun area(): Double = Math.PI * radiusX * radiusY
}

