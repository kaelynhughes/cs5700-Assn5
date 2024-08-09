package org.example.state.floatState

class NumNoPeriod: FloatState() {
    override fun getValidity(): Boolean {
        return false
    }
    override fun nextCharacter(char: String): FloatState {
        TODO("Not yet implemented")
    }
}