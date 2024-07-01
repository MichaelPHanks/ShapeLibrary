package org.example

class Ellipse(private var center: Point, private var radiusX: Double, private var radiusY: Double) : Shape(){

    init {
        require(Math.PI * radiusX * radiusY > 0)
    }

    override fun move(deltaX: Double, deltaY: Double) {
        TODO("Not yet implemented")
    }

    override fun area(): Double {
        TODO("Not yet implemented")
    }
}

