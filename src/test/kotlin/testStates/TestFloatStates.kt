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
    }
}