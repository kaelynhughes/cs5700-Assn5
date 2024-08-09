import kotlin.test.*
import org.example.concreteDetectors.EmailDetector

class TestEmailDetector {
    @Test
    fun testEmailDetector() {
        val detector = EmailDetector()
        assertTrue { detector.detectValidity("a@b.c") }
        assertTrue { detector.detectValidity("joseph.ditton@usu.edu") }
        assertTrue { detector.detectValidity("{}*\$.&\$*(@*\$%&.*&*") }

        assertFalse { detector.detectValidity("") }
        assertFalse { detector.detectValidity("@b.c") }
        assertFalse { detector.detectValidity("a@b@c.com") }
        assertFalse { detector.detectValidity("a.b@b.b.c") }
    }
}