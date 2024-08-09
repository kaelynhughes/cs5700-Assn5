package org.example.state.floatState

class PeriodNoDec: FloatState() {
    override fun getValidity(): Boolean {
        return false
    }
    override fun nextCharacter(char: String): FloatState {
        require (char.length == 1) {
            "This function takes exactly one character."
        }
        return if (isInteger(char)) {
            Valid()
        } else {
            Invalid()
        }
    }
}