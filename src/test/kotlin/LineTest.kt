import org.example.Line
import org.example.Point
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class LineTest {
    @Test
    fun testLineIntegrity()
    {
        val point = Point(1.0,2.0)
        val point1 = Point(1.0,2.0)
        assertFailsWith<IllegalArgumentException> { Line(point1, point) }
    }
}