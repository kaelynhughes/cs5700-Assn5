package testStates

import kotlin.test.*
import org.example.state.binaryState.*

class TestBinaryStates {
    @Test
    fun testEmpty() {
        val state = Empty()
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