import org.example.concreteDetectors.PasswordDetector
import kotlin.test.*

class TestPasswordDetector {
    @Test
    fun testPasswordDetector() {
        val detector = PasswordDetector()
        assertTrue { detector.detectValidity("aaaaH!aa") }
        assertTrue { detector.detectValidity("1234567*9J") }
        assertTrue { detector.detectValidity("asdpoihj;loikjasdf;ijp;lij2309jasd;lfkm20ij@aH") }

        assertFalse { detector.detectValidity("a") }
        assertFalse { detector.detectValidity("aaaaaaa!") }
        assertFalse { detector.detectValidity("aaaHaaaaa") }
        assertFalse { detector.detectValidity("Abbbbbbb!") }
    }
}