package org.example.state.floatState

class LeadingZero: FloatState() {
    override fun getValidity(): Boolean {
        return false
    }
    override fun nextCharacter(char: String): FloatState {
        require (char.length == 1) {
            "This function takes exactly one character."
        }
        if (char == ".") {
            return PeriodNoDec()
        } else {
            return Invalid()
        }
    }
}