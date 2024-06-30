import org.example.Point
import org.example.Rectangle
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class RectangleTest
{
    @Test
    fun testCreateRectangle()
    {
        val point1 = Point(1.0,2.0)
        val point2 = Point(1.0,6.4)
        val point3 = Point(1.1,2.1)

        assertFailsWith<IllegalArgumentException>{Rectangle(point1, point2)}

        val rectangle = Rectangle(point1, point3)

        assertEquals(point1, rectangle.getTopRightPoint())
        assertEquals(point3, rectangle.getBottomLeftPoint())
    }



    @Test
    fun testRectangleMove()
    {
        val point1 = Point(-18.0, -15.0)
        val point2 = Point(-20.0, -16.5)

        val rectangle = Rectangle(point1, point2)
        assertEquals(3.0, rectangle.area())
        rectangle.move(-0.000203523, 435283745.34)
        assertEquals(3.0, rectangle.area())
        assertEquals(-20.000203523, rectangle.getBottomLeftPoint().getX())
        assertEquals(-18.000203523, rectangle.getTopRightPoint().getX())


    }

    @Test
    fun testRectangleArea()
    {
        val point1 = Point(35.5, 16.5)
        val point2 = Point(25.5, 15.0)

        val rectangle = Rectangle(point1, point2)
        assertEquals(15.0, rectangle.area())


    }



}