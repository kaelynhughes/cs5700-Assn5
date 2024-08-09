import org.example.concreteDetectors.IntegerDetector
import org.example.state.integerState.*
import kotlin.test.*

class TestDetector {
    @Test
    fun testSplitString() {
        val detector = IntegerDetector()
        assertEquals(listOf("1", "2", "3", "4", "5", "6", "7"), detector.splitString("1234567"))
        assertEquals(listOf(), detector.splitString(""))
        assertEquals(listOf("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"), detector.splitString("abcdefghijk"))
        assertEquals(listOf("a", "b", "c", "@", "g", "m", "a", "i", "l", ".", "c", "o", "m"), detector.splitString("abc@gmail.com"))
        assertEquals(listOf("1", "1", "0", "1", "0", "0", "1"), detector.splitString("1101001"))
    }
}