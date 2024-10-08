package org.example.state.floatState

class NumNoPeriod: FloatState() {
    override fun nextCharacter(char: String): FloatState {
        require (char.length == 1) {
            "This function takes exactly one character."
        }
        return if (isInteger(char)) {
            this
        } else if (char == ".") {
            PeriodNoDec()
        } else {
            Invalid()
        }
    }
}