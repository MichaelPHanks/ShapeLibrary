import org.example.Point
import org.example.Rectangle
import org.example.Square
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class SquareTest
{

    @Test
    fun testCreateSquare()
    {
        val point1 = Point(1.0,2.0)
        val point2 = Point(1.0,6.4)
        val point3 = Point(1.1,2.1)

        assertFailsWith<IllegalArgumentException>{ Square(point1, point2) }

        val square = Square(point1, point3)

        assertEquals(point1, square.getTopRightPoint())
        assertEquals(point3, square.getBottomLeftPoint())
    }



    @Test
    fun testSquareMove()
    {

        val point1 = Point(-18.0, -15.0)
        val point2 = Point(-20.0, -17.0)

        val square = Square(point1, point2)
        assertEquals(4.0, square.area())
        square.move(5.0, 0.000000001)
        assertEquals(4.0, square.area())
        assertEquals(-15.0, square.getBottomLeftPoint().getX())
        assertEquals(-13.0, square.getTopRightPoint().getX())


    }

    @Test
    fun testSquareArea()
    {
        val point1 = Point(35.5, 25.0)
        val point2 = Point(25.5, 15.0)

        val square = Square(point1, point2)
        assertEquals(100.0, square.area())


    }

}