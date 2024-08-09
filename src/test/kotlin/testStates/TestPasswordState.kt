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
        assertFails {
            state.nextCharLong("")
        }
        assertFails {
            state.nextCharLong("ab")
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
        assertFails {
            state.nextCharLong("")
        }
        assertFails {
            state.nextCharLong("ab")
        }
    }

    @Test
    fun testSpecialChar() {
        val state = SpecialChar()

        assertIs<SpecialChar>(state.nextCharacter("a"))
        assertIs<SpecialChar>(state.nextCharacter("4"))
        assertIs<CapChar>(state.nextCharacter("C"))
        assertIs<SpecialChar>(state.nextCharacter("*"))

        assertIs<CharLong>(state.nextCharLong("0"))
        assertIs<CharLong>(state.nextCharLong("c"))
        assertIs<Valid>(state.nextCharLong("C"))
        assertIs<CharLong>(state.nextCharLong("*"))

        assertFails {
            state.nextCharacter("")
        }
        assertFails {
            state.nextCharacter("ab")
        }
        assertFails {
            state.nextCharLong("")
        }
        assertFails {
            state.nextCharLong("ab")
        }
    }
    @Test
    fun testLong() {
        val state = PasswordLong()

        assertIs<PasswordLong>(state.nextCharacter("a"))
        assertIs<PasswordLong>(state.nextCharacter("4"))
        assertIs<CapLong>(state.nextCharacter("C"))
        assertIs<CharLong>(state.nextCharacter("*"))

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
        assertFails {
            state.nextCharLong("")
        }
        assertFails {
            state.nextCharLong("ab")
        }
    }

    @Test
    fun testCharLong() {
        val state = CharLong()

        assertIs<CharLong>(state.nextCharacter("a"))
        assertIs<CharLong>(state.nextCharacter("4"))
        assertIs<Valid>(state.nextCharacter("C"))
        assertIs<CharLong>(state.nextCharacter("*"))

        assertIs<CharLong>(state.nextCharLong("0"))
        assertIs<CharLong>(state.nextCharLong("c"))
        assertIs<Valid>(state.nextCharLong("C"))
        assertIs<CharLong>(state.nextCharLong("*"))

        assertFails {
            state.nextCharacter("")
        }
        assertFails {
            state.nextCharacter("ab")
        }
        assertFails {
            state.nextCharLong("")
        }
        assertFails {
            state.nextCharLong("ab")
        }
    }
    @Test
    fun testCapLong() {
        val state = CapLong()

        assertIs<CapLong>(state.nextCharacter("a"))
        assertIs<CapLong>(state.nextCharacter("4"))
        assertIs<CapLong>(state.nextCharacter("C"))
        assertIs<CapCharLong>(state.nextCharacter("*"))

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
        assertFails {
            state.nextCharLong("")
        }
        assertFails {
            state.nextCharLong("ab")
        }
    }
    @Test
    fun testCapChar() {
        val state = CapChar()

        assertIs<CapChar>(state.nextCharacter("a"))
        assertIs<CapChar>(state.nextCharacter("4"))
        assertIs<CapChar>(state.nextCharacter("C"))
        assertIs<CapChar>(state.nextCharacter("*"))

        assertIs<Valid>(state.nextCharLong("0"))
        assertIs<Valid>(state.nextCharLong("c"))
        assertIs<Valid>(state.nextCharLong("C"))
        assertIs<CapCharLong>(state.nextCharLong("*"))

        assertFails {
            state.nextCharacter("")
        }
        assertFails {
            state.nextCharacter("ab")
        }
        assertFails {
            state.nextCharLong("")
        }
        assertFails {
            state.nextCharLong("ab")
        }
    }
    @Test
    fun testCapCharLong() {
        val state = CapCharLong()

        assertIs<Valid>(state.nextCharacter("a"))
        assertIs<Valid>(state.nextCharacter("4"))
        assertIs<Valid>(state.nextCharacter("C"))
        assertIs<CapCharLong>(state.nextCharacter("*"))

        assertIs<Valid>(state.nextCharLong("0"))
        assertIs<Valid>(state.nextCharLong("c"))
        assertIs<Valid>(state.nextCharLong("C"))
        assertIs<CapCharLong>(state.nextCharLong("*"))

        assertFails {
            state.nextCharacter("")
        }
        assertFails {
            state.nextCharacter("ab")
        }
        assertFails {
            state.nextCharLong("")
        }
        assertFails {
            state.nextCharLong("ab")
        }
    }
    @Test
    fun testValid() {
        val state = Valid()

        assertIs<Valid>(state.nextCharacter("a"))
        assertIs<Valid>(state.nextCharacter("4"))
        assertIs<Valid>(state.nextCharacter("C"))
        assertIs<CapCharLong>(state.nextCharacter("*"))

        assertIs<Valid>(state.nextCharLong("0"))
        assertIs<Valid>(state.nextCharLong("c"))
        assertIs<Valid>(state.nextCharLong("C"))
        assertIs<CapCharLong>(state.nextCharLong("*"))

        assertFails {
            state.nextCharacter("")
        }
        assertFails {
            state.nextCharacter("ab")
        }
        assertFails {
            state.nextCharLong("")
        }
        assertFails {
            state.nextCharLong("ab")
        }
    }
}