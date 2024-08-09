package org.example.state.integerState

class Invalid: IntegerState() {
    override fun getValidity(): Boolean {
        return false
    }

    override fun nextCharacter(char: String): IntegerState {
        require (char.length == 1) {
            "This function takes exactly one character."
        }
        return this
    }
}