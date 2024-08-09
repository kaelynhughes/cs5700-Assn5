package org.example.state.integerState

class Invalid: IntegerState() {
    override fun getValidity(): Boolean {
        return false
    }

    override fun nextCharacter(char: String): IntegerState {
        return this
    }
}