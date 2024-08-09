package testStates

import org.example.state.passwordState.*
import kotlin.test.*

class TestPasswordState {
    @Test
    fun testTooShort() {
        val state = TooShort()
        assertIs<TooShort>(state.nextCharacter("a"))
        assertIs<TooShort>(state.nextCharacter("4"))
        assertIs<Cap>(state.nextCharacter("C"))
        assertIs<SpecialChar>(state.nextCharacter("*"))

        assertIs<PasswordLong>(state.nextCharLong("0"))
        assertIs<PasswordLong>(state.nextCharLong("c"))
        assertIs<CapLong>(state.nextCharLong("C"))
        assertIs<CharLong>(state.nextCharLong("*"))
    }
}