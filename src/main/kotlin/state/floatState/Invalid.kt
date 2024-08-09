package org.example.state.floatState

class Invalid: FloatState() {
    override fun nextCharacter(char: String): FloatState {
        require (char.length == 1) {
            "This function takes exactly one character."
        }
        return this
    }
}