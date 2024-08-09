import org.example.concreteDetectors.BinaryDetector
import kotlin.test.*

class TestBinaryDetector {
    @Test
    fun testBinaryDetector() {
        val detector = BinaryDetector()
        assertTrue { detector.detectValidity("1") }
        assertTrue { detector.detectValidity("11") }
        assertTrue { detector.detectValidity("111") }
        assertTrue { detector.detectValidity("101") }
        assertTrue { detector.detectValidity("111111") }
        assertTrue { detector.detectValidity("10011010001") }

        assertFalse { detector.detectValidity("01") }
        assertFalse { detector.detectValidity("10") }
        assertFalse { detector.detectValidity("1000010") }
        assertFalse { detector.detectValidity("100a01") }
        assertFalse { detector.detectValidity("") }
        assertFalse { detector.detectValidity("AaBbCc") }
    }
}