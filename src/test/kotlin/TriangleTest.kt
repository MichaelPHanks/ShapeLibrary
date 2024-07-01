import org.example.Point
import org.example.Rectangle
import org.example.Triangle
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class TriangleTest {
    @Test
    fun testCreateTriangle()
    {
        val point1 = Point(1.0,2.0)
        val point2 = Point(1.0,2.5)
        val point3 = Point(1.0,3.0)
        val point4 = Point(2.0, 4.0)
        assertFailsWith<IllegalArgumentException>{ Triangle(point1, point2, point3) }
        val triangle = Triangle(point1, point2, point4)
        assertEquals(1.0, triangle.getPoint1().getX())
        assertEquals(1.0, triangle.getPoint2().getX())
        assertEquals(2.0, triangle.getPoint3().getX())
    }

    @Test
    fun testTriangleArea()
    {
        val point1 = Point(1.0,2.0)
        val point2 = Point(5.0, 10.0)
        val point3 = Point(-12.0, -4.0)
        val point4 = Point(2346.123, -1234.5678)
        val triangle = Triangle(point1, point2, point3)
        val triangle2 = Triangle(point1, point2, point4)
        assertEquals(40.0, triangle.area())
        assertEquals(11853.6276, triangle2.area())



    }

    @Test
    fun testTriangleMove()
    {
        val point1 = Point(1.0,2.0)
        val point2 = Point(5.0, 10.0)
        val point3 = Point(-12.0, -4.0)
        val triangle = Triangle(point1, point2, point3)
        assertEquals(40.0, triangle.area())
        triangle.move(-15.1, 14.0)
        assertEquals(40.0, triangle.area())
        assertEquals(-14.1, triangle.getPoint1().getX())
        assertEquals(-10.1, triangle.getPoint2().getX())
        assertEquals(-27.1, triangle.getPoint3().getX())

        assertEquals(16.0, triangle.getPoint1().getY())
        assertEquals(24.0, triangle.getPoint2().getY())
        assertEquals(10.0, triangle.getPoint3().getY())



    }
}