package testStates

import org.example.state.integerState.*
import kotlin.test.*

class TestIntegerStates {
    @Test
    fun testEmptyState() {
        val state = Empty()
        assertEquals(false, state.getValidity())
        assertIs<Valid>(state.nextCharacter("1"))
        assertIs<Invalid>(state.nextCharacter("a"))
        assertIs<Invalid>(state.nextCharacter("$"))
        assertIs<Invalid>(state.nextCharacter("."))
    }
    fun testValidState() {
        val state = Valid()
        assertEquals(true, state.getValidity())
        assertIs<Valid>(state.nextCharacter("4"))
        assertIs<Invalid>(state.nextCharacter("."))
        assertIs<Invalid>(state.nextCharacter("a"))
    }
    fun testInvalidState() {
        val state = Invalid()
        assertEquals(false, state.getValidity())
        assertIs<Invalid>(state.nextCharacter("4"))
        assertIs<Invalid>(state.nextCharacter("."))
        assertIs<Invalid>(state.nextCharacter("a"))
    }
}