import org.example.concreteDetectors.PasswordDetector
import kotlin.test.*

class TestPasswordDetector {
    @Test
    fun testPasswordDetector() {
        val detector = PasswordDetector()
        assertEquals(true, detector.detectValidity("aaaaH!aa"))
        assertEquals(true, detector.detectValidity("1234567*9J"))
        assertEquals(true, detector.detectValidity("asdpoihj;loikjasdf;ijp;lij2309jasd;lfkm20ij@aH"))

        assertEquals(false, detector.detectValidity("a"))
        assertEquals(false, detector.detectValidity("aaaaaaa!"))
        assertEquals(false, detector.detectValidity("aaaHaaaaa"))
        assertEquals(false, detector.detectValidity("Abbbbbbb!"))
    }
}