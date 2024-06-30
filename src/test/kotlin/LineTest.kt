import org.example.Line
import org.example.Point
import kotlin.math.sqrt
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class LineTest {
    @Test
    fun testCreateLine()
    {
        val point = Point(1.0,2.0)
        val point1 = Point(1.0,2.0)
        assertFailsWith<IllegalArgumentException> { Line(point1, point) }
        val point2 = Point(1.0, 2.1)
        val line = Line(point1, point2)
        assertEquals(point1, line.getStart())
        assertEquals(point2, line.getEnd())

    }
//    assertEquals(0.1, line.length(), 0.000001)
//    assertEquals(Double.NEGATIVE_INFINITY, line.slope())

    @Test
    fun testLineLength()
    {
        val point1 = Point(10.0, 15.0)
        val point2 = Point(12.0,17.0)
        val line = Line(point1, point2)

        assertEquals(sqrt(8.0), line.length())

    }

    @Test
    fun testLineSlope()
    {
        val point1 = Point(10.0, 15.0)
        val point2 = Point(12.0,17.0)
        val line = Line(point1, point2)

        assertEquals(1.0, line.slope())

    }

    @Test
    fun testLineMove()
    {
        val point1 = Point(10.0, 15.0)
        val point2 = Point(12.0, 17.0)
        val line = Line(point1, point2)

        line.move(12.0, -7.5)
        assertEquals(22.0, line.getStart().getX())
        assertEquals(7.5, line.getStart().getY())
        assertEquals(1.0, line.slope())
        assertEquals(sqrt(8.0), line.length())
    }
}