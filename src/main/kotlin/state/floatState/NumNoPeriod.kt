package org.example.state.floatState

class NumNoPeriod: FloatState() {
    override fun getValidity(): Boolean {
        return false
    }
    override fun nextCharacter(char: String): FloatState {
        require (char.length == 1) {
            "This function takes exactly one character."
        }
        TODO("Not yet implemented")
    }
}