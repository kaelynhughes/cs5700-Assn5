package org.example.state.floatState

class Valid: FloatState() {
    override fun getValidity(): Boolean {
        return true
    }
    override fun nextCharacter(char: String): FloatState {
        TODO("Not yet implemented")
    }
}