package testStates

import kotlin.test.*
import org.example.state.emailState.*
import kotlin.test.assertFails

class TestEmailStates {
    @Test
    fun testEmpty1() {
        val state = Empty1()

        assertIs<Invalid>(state.nextCharacter(" "))
        assertIs<Invalid>(state.nextCharacter("@"))
        assertIs<Part1>(state.nextCharacter("."))

        assertIs<Part1>(state.nextCharacter("a"))
        assertIs<Part1>(state.nextCharacter("T"))
        assertIs<Part1>(state.nextCharacter("+"))
        assertIs<Part1>(state.nextCharacter("2"))
        assertIs<Part1>(state.nextCharacter("6"))
        assertIs<Part1>(state.nextCharacter("("))

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

        assertIs<Invalid>(state.nextCharacter(" "))
        assertIs<Empty2>(state.nextCharacter("@"))
        assertIs<Part1>(state.nextCharacter("."))

        assertIs<Part1>(state.nextCharacter("a"))
        assertIs<Part1>(state.nextCharacter("T"))
        assertIs<Part1>(state.nextCharacter("+"))
        assertIs<Part1>(state.nextCharacter("2"))
        assertIs<Part1>(state.nextCharacter("6"))
        assertIs<Part1>(state.nextCharacter("("))

        assertFails {
            state.nextCharacter("")
        }
        assertFails {
            state.nextCharacter("ab")
        }
    }
    @Test
    fun testEmpty2() {
        val state = Empty2()

        assertIs<Invalid>(state.nextCharacter(" "))
        assertIs<Invalid>(state.nextCharacter("@"))
        assertIs<Invalid>(state.nextCharacter("."))

        assertIs<Part2>(state.nextCharacter("a"))
        assertIs<Part2>(state.nextCharacter("T"))
        assertIs<Part2>(state.nextCharacter("+"))
        assertIs<Part2>(state.nextCharacter("2"))
        assertIs<Part2>(state.nextCharacter("6"))
        assertIs<Part2>(state.nextCharacter("("))

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

        assertIs<Invalid>(state.nextCharacter(" "))
        assertIs<Invalid>(state.nextCharacter("@"))
        assertIs<Empty3>(state.nextCharacter("."))

        assertIs<Part2>(state.nextCharacter("a"))
        assertIs<Part2>(state.nextCharacter("T"))
        assertIs<Part2>(state.nextCharacter("+"))
        assertIs<Part2>(state.nextCharacter("2"))
        assertIs<Part2>(state.nextCharacter("6"))
        assertIs<Part2>(state.nextCharacter("("))

        assertFails {
            state.nextCharacter("")
        }
        assertFails {
            state.nextCharacter("ab")
        }
    }

    @Test
    fun testEmpty3() {
        val state = Empty3()

        assertIs<Invalid>(state.nextCharacter(" "))
        assertIs<Invalid>(state.nextCharacter("@"))
        assertIs<Invalid>(state.nextCharacter("."))

        assertIs<Valid>(state.nextCharacter("a"))
        assertIs<Valid>(state.nextCharacter("T"))
        assertIs<Valid>(state.nextCharacter("+"))
        assertIs<Valid>(state.nextCharacter("2"))
        assertIs<Valid>(state.nextCharacter("6"))
        assertIs<Valid>(state.nextCharacter("("))

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

        assertIs<Invalid>(state.nextCharacter(" "))
        assertIs<Invalid>(state.nextCharacter("@"))
        assertIs<Invalid>(state.nextCharacter("a"))
        assertIs<Invalid>(state.nextCharacter("T"))
        assertIs<Invalid>(state.nextCharacter("+"))
        assertIs<Invalid>(state.nextCharacter("2"))
        assertIs<Invalid>(state.nextCharacter("6"))
        assertIs<Invalid>(state.nextCharacter("("))

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

        assertIs<Invalid>(state.nextCharacter(" "))
        assertIs<Invalid>(state.nextCharacter("@"))
        assertIs<Invalid>(state.nextCharacter("."))

        assertIs<Valid>(state.nextCharacter("a"))
        assertIs<Valid>(state.nextCharacter("T"))
        assertIs<Valid>(state.nextCharacter("+"))
        assertIs<Valid>(state.nextCharacter("2"))
        assertIs<Valid>(state.nextCharacter("6"))
        assertIs<Valid>(state.nextCharacter("("))

        assertFails {
            state.nextCharacter("")
        }
        assertFails {
            state.nextCharacter("ab")
        }
    }
}