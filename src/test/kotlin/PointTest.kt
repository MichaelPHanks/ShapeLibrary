import org.example.Point
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class PointTest
{
    @Test
    fun testCreatePoint()
    {
        val point1 = Point(1.0,1.2)
        assertEquals(1.0, point1.getX())
        assertEquals(1.2, point1.getY())
    }

    @Test
    fun testMovePoint()
    {
        val point = Point(15.0,-16.0)
        point.move(15.0,1.0)
        assertEquals(30.0, point.getX())
        assertEquals(-15.0, point.getY())
    }

    @Test
    fun testClonePoint()
    {
        val point = Point(10.0, 12.2354)

        val point2 = point
        assertEquals(point.getX(), point2.getX())
        assertEquals(point.getX(), point2.getX())
        point2.move(10.0,0.0)
        assertNotEquals(point.getX(), point2.getX())
        assertEquals(10.0, point.getX())
        assertEquals(20.0, point2.getX())

    }

}