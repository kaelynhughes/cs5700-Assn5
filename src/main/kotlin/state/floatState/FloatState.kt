package org.example.state.floatState

abstract class FloatState {
    abstract fun nextCharacter(char: String): FloatState
    fun isInteger(char: String): Boolean {
        val ints = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9")
        return ints.contains(char)
    }
}