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

        assertFails {
            state.nextCharacter("")
        }
        assertFails {
            state.nextCharacter("ab")
        }
    }

    @Test
    fun testCap() {
        val state = Cap()
        assertIs<Cap>(state.nextCharacter("a"))
        assertIs<Cap>(state.nextCharacter("4"))
        assertIs<Cap>(state.nextCharacter("C"))
        assertIs<CapChar>(state.nextCharacter("*"))

        assertIs<CapLong>(state.nextCharLong("0"))
        assertIs<CapLong>(state.nextCharLong("c"))
        assertIs<CapLong>(state.nextCharLong("C"))
        assertIs<CapCharLong>(state.nextCharLong("*"))

        assertFails {
            state.nextCharacter("")
        }
        assertFails {
            state.nextCharacter("ab")
        }
    }

    @Test
    fun testSpecialChar() {
        val state = SpecialChar()

        assertFails {
            state.nextCharacter("")
        }
        assertFails {
            state.nextCharacter("ab")
        }
    }
    @Test
    fun testLong() {
        val state = PasswordLong()

        assertFails {
            state.nextCharacter("")
        }
        assertFails {
            state.nextCharacter("ab")
        }
    }

    @Test
    fun testCharLong() {
        val state = CharLong()

        assertFails {
            state.nextCharacter("")
        }
        assertFails {
            state.nextCharacter("ab")
        }
    }
    @Test
    fun testCapLong() {
        val state = CapLong()

        assertFails {
            state.nextCharacter("")
        }
        assertFails {
            state.nextCharacter("ab")
        }
    }
    @Test
    fun testCapChar() {
        val state = CapChar()

        assertFails {
            state.nextCharacter("")
        }
        assertFails {
            state.nextCharacter("ab")
        }
    }
    @Test
    fun testCapCharLong() {
        val state = CapCharLong()

        assertFails {
            state.nextCharacter("")
        }
        assertFails {
            state.nextCharacter("ab")
        }
    }
    @Test
    fun testValid() {
        val state = Valid()

        assertFails {
            state.nextCharacter("")
        }
        assertFails {
            state.nextCharacter("ab")
        }
    }
}