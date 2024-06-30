package org.example

// NOTE: radiusX & radiusY seem improper for this class, if we can rotate objects. If not, this should be fine.
class Ellipse(private var center: Point, private var radiusX: Double, private var radiusY: Double) : Shape(){


    override fun move(deltaX: Double, deltaY: Double) {
        TODO("Not yet implemented")
    }

    override fun area(): Double {
        TODO("Not yet implemented")
    }
}

