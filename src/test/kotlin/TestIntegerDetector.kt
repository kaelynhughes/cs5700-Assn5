import org.example.concreteDetectors.IntegerDetector
import kotlin.test.*

class TestIntegerDetector {
    @Test
    fun testIntegerDetector() {
        val detector = IntegerDetector()
        assertEquals(true, detector.detectValidity("12345"))
        assertEquals(false, detector.detectValidity("abcdefg"))
        assertEquals(false, detector.detectValidity("12.34"))
        assertEquals(false, detector.detectValidity("123."))
    }
}