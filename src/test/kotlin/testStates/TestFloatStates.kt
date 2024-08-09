package testStates

import kotlin.test.*
import org.example.state.floatState.*

class TestFloatStates {
    @Test
    fun testEmpty() {
        val state = Empty()
        assertIs<Invalid>(state.nextCharacter("&"))
        assertIs<LeadingZero>(state.nextCharacter("0"))
        assertIs<NumNoPeriod>(state.nextCharacter("8"))
        assertIs<PeriodNoDec>(state.nextCharacter("."))
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
        assertIs<Invalid>(state.nextCharacter("&"))
        assertIs<Invalid>(state.nextCharacter("0"))
        assertIs<Invalid>(state.nextCharacter("6"))
        assertIs<Invalid>(state.nextCharacter("."))
        assertFails {
            state.nextCharacter("")
        }
        assertFails {
            state.nextCharacter("ab")
        }
    }
    @Test
    fun testLeadingZero() {
        val state = LeadingZero()
        assertFails {
            state.nextCharacter("")
        }
        assertFails {
            state.nextCharacter("ab")
        }
    }
    @Test
    fun testNumNoPeriod() {
        val state = NumNoPeriod()
        assertFails {
            state.nextCharacter("")
        }
        assertFails {
            state.nextCharacter("ab")
        }
    }
    @Test
    fun testPeriodNoDec() {
        val state = PeriodNoDec()
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