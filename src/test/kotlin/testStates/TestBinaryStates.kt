package testStates

import kotlin.test.*
import org.example.state.binaryState.*

class TestBinaryStates {
    @Test
    fun testEmpty() {
        val state = Empty()

        assertIs<Valid>(state.nextCharacter("1"))

        assertIs<Invalid>(state.nextCharacter("0"))
        assertIs<Invalid>(state.nextCharacter("7"))
        assertIs<Invalid>(state.nextCharacter("a"))
        assertIs<Invalid>(state.nextCharacter("I"))
        assertIs<Invalid>(state.nextCharacter("*"))
        assertIs<Invalid>(state.nextCharacter("+"))

        assertFails {
            state.nextCharacter("")
        }
        assertFails {
            state.nextCharacter("ab")
        }
    }
    @Test
    fun testValid() {
        val state = Invalid()

        assertIs<Invalid>(state.nextCharacter("1"))
        assertIs<Invalid>(state.nextCharacter("0"))
        assertIs<Invalid>(state.nextCharacter("7"))
        assertIs<Invalid>(state.nextCharacter("a"))
        assertIs<Invalid>(state.nextCharacter("I"))
        assertIs<Invalid>(state.nextCharacter("*"))
        assertIs<Invalid>(state.nextCharacter("+"))

        assertFails {
            state.nextCharacter("")
        }
        assertFails {
            state.nextCharacter("ab")
        }
    }
    @Test
    fun testInvalid() {
        val state = Invalid()
        assertFails {
            state.nextCharacter("")
        }
        assertFails {
            state.nextCharacter("ab")
        }
    }
}