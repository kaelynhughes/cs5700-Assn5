package testStates

import kotlin.test.Test
import org.example.state.emailState.*
import kotlin.test.assertFails

class TestEmailStates {
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
    fun testPart1() {
        val state = Part1()

        assertFails {
            state.nextCharacter("")
        }
        assertFails {
            state.nextCharacter("ab")
        }
    }
    @Test
    fun testPart2() {
        val state = Part2()

        assertFails {
            state.nextCharacter("")
        }
        assertFails {
            state.nextCharacter("ab")
        }
    }
    @Test
    fun testPart3() {
        val state = Part3()

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