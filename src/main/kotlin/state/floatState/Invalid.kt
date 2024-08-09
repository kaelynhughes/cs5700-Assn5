package org.example.state.floatState

class Invalid: FloatState() {
    override fun nextCharacter(char: String): FloatState {
        return this
    }
}