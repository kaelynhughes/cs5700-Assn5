package org.example.state.passwordState

abstract class PasswordState {
    abstract fun nextCharacter(char: String): PasswordState
    abstract fun nextCharLong(char: String): PasswordState
    fun isCapital(char: String): Boolean {
        return (char != char.lowercase())
    }
    fun isLower(char: String): Boolean {
        return (char != char.uppercase())
    }
    fun isNumber(char: String): Boolean {
        val ints = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9")
        return ints.contains(char)
    }
}