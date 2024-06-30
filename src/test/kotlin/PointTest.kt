import org.example.Point
import kotlin.test.Test
import kotlin.test.assertEquals

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

    }

    @Test
    fun testClonePoint()
    {

    }

}