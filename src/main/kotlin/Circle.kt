package org.example

import kotlin.math.pow

class Circle(private var center: Point, private var radius: Double): Shape(){

    init {
        require(radius > 0)
    }

    fun getCenter(): Point = this.center
    fun getRadius(): Double = this.radius

    override fun area(): Double = Math.PI * radius.pow(2.0)

    override fun move(deltaX: Double, deltaY: Double) {
        this.center.move(deltaX, deltaY)
    }
}

