package org.example.state.floatState

class PeriodNoDec: FloatState() {
    override fun getValidity(): Boolean {
        return false
    }
    override fun nextCharacter(char: String): FloatState {
        TODO("Not yet implemented")
    }
}