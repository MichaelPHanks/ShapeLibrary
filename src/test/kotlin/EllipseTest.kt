import org.example.Ellipse
import org.example.Point
import org.example.Rectangle
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class EllipseTest
{
    @Test
    fun testCreateEllipse()
    {
        val center = Point(1.0,2.0)

        assertFailsWith<IllegalArgumentException>{ Ellipse(center, 15.0, 0.0) }
        assertFailsWith<IllegalArgumentException>{ Ellipse(center, 15.0, -0.0000000001) }

        val ellipse = Ellipse(center, 15.0, 0.001)

        assertEquals(center, ellipse.getCenter())

    }

    @Test
    fun testEllipseArea()
    {
        val center = Point(1.0,2.0)

        val ellipse = Ellipse(center, 5.0, 6.0)

        assertEquals(30.0 * Math.PI, ellipse.area())

    }

    @Test
    fun testEllipseMove()
    {
        val center = Point(1.0,2.0)

        val ellipse = Ellipse(center, 5.0, 6.0)

        assertEquals(30.0 * Math.PI, ellipse.area())

        ellipse.move(12.0, 4.0)

        assertEquals(30.0 * Math.PI, ellipse.area())

        assertEquals(13.0, ellipse.getCenter().getX())
        assertEquals(6.0, ellipse.getCenter().getY())

    }
}