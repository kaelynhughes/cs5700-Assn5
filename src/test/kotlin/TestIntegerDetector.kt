import org.example.concreteDetectors.IntegerDetector
import kotlin.test.*

class TestIntegerDetector {
    @Test
    fun testIntegerDetector() {
        val detector = IntegerDetector()
        assertTrue { detector.detectValidity("12345") }
        assertTrue { detector.detectValidity("1") }
        assertFalse { detector.detectValidity("abcdefg") }
        assertFalse { detector.detectValidity("12.34") }
        assertFalse { detector.detectValidity("123.") }
    }
}