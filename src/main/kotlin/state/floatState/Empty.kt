package org.example.state.floatState

class Empty: FloatState() {
    override fun nextCharacter(char: String): FloatState {
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