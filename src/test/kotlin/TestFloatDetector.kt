import org.example.concreteDetectors.FloatDetector
import kotlin.test.Test
import kotlin.test.assertEquals

class TestFloatDetector {
    @Test
    fun testFloatDetector() {
        val detector = FloatDetector()
        assertEquals(true, detector.detectValidity("456.903"))
        assertEquals(true, detector.detectValidity("0.9"))
        assertEquals(true, detector.detectValidity(".9"))
    }
}