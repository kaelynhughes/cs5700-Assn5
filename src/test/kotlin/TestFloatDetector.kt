import org.example.concreteDetectors.FloatDetector
import kotlin.test.*

class TestFloatDetector {
    @Test
    fun testFloatDetector() {
        val detector = FloatDetector()
        assertTrue { detector.detectValidity("456.903") }
        assertTrue { detector.detectValidity("0.9") }
        assertTrue { detector.detectValidity(".9") }

        assertFalse { detector.detectValidity("123") }
        assertFalse { detector.detectValidity("123.123.") }
        assertFalse { detector.detectValidity("123.02a") }
        assertFalse { detector.detectValidity("123.") }
        assertFalse { detector.detectValidity("012.4") }
    }
}