package org.example.state.floatState

class Valid: FloatState() {
    override fun getValidity(): Boolean {
        return true
    }
    override fun nextCharacter(char: String): FloatState {
        require (char.length == 1) {
            "This function takes exactly one character."
        }
        return if (isInteger(char)) {
            Valid()
        } else {
            Invalid()
        }
    }
}