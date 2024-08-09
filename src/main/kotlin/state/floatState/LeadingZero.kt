package org.example.state.floatState

class LeadingZero: FloatState() {
    override fun nextCharacter(char: String): FloatState {
        require (char.length == 1) {
            "This function takes exactly one character."
        }
        return if (char == ".") {
            PeriodNoDec()
        } else {
            Invalid()
        }
    }
}