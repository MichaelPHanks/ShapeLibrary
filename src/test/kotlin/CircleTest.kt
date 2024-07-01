import org.example.Circle
import org.example.Ellipse
import org.example.Point
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class CircleTest {
    @Test
    fun testCreateCircle()
    {
        val center = Point(1.0,2.0)

        assertFailsWith<IllegalArgumentException>{ Circle(center, 0.0) }
        assertFailsWith<IllegalArgumentException>{ Circle(center, -0.000000001) }

        val circle = Circle(center, 15.0)

        assertEquals(center, circle.getCenter())

    }

    @Test
    fun testCircleArea()
    {
        val point1 = Point(1.0,2.0)

        val circle = Circle(point1, 5.0)

        assertEquals(25.0 * Math.PI, circle.area())

    }

    @Test
    fun testCircleMove()
    {
        val center = Point(1.0,2.0)

        val circle = Circle(center, 5.0)

        assertEquals(25.0 * Math.PI, circle.area())

        circle.move(12.0, 4.0)

        assertEquals(25.0 * Math.PI, circle.area())

        assertEquals(13.0, circle.getCenter().getX())
        assertEquals(6.0, circle.getCenter().getY())

    }
}