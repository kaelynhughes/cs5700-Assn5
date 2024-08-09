package org.example.state.floatState

class LeadingZero: FloatState() {
    override fun getValidity(): Boolean {
        return false
    }
    override fun nextCharacter(char: String): FloatState {
        TODO("Not yet implemented")
    }
}