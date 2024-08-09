import kotlin.test.*
import org.example.concreteDetectors.EmailDetector

class TestEmailDetector {
    @Test
    fun testEmailDetector() {
        val detector = EmailDetector()
        assertEquals(true, detector.detectValidity("a@b.c"))
        assertEquals(true, detector.detectValidity("joseph.ditton@usu.edu"))
        assertEquals(true, detector.detectValidity("{}*\$.&\$*(@*\$%&.*&*"))

        assertEquals(false, detector.detectValidity(""))
        assertEquals(false, detector.detectValidity("@b.c"))
        assertEquals(false, detector.detectValidity("a@b@c.com"))
        assertEquals(false, detector.detectValidity("a.b@b.b.c"))
    }
}