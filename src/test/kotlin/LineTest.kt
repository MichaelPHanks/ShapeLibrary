import org.example.Line
import org.example.Point
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
    {}

    @Test
    fun testLineSlope()
    {}

    @Test
    fun testLineMove()
    {}
}