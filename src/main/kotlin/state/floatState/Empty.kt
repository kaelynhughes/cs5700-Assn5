package org.example.state.floatState

class Empty: FloatState() {
    override fun nextCharacter(char: String): FloatState {
        require (char.length == 1) {
            "This function takes exactly one character."
        }
        return if (char == "0") {
            LeadingZero()
        } else if (char == ".") {
            PeriodNoDec()
        } else if (isInteger(char)) {
            NumNoPeriod()
        } else {
            Invalid()
        }
    }
}