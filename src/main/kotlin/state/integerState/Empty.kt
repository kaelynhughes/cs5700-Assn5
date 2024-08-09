package org.example.state.integerState

class Empty: IntegerState() {
    override fun getValidity(): Boolean {
        return false
    }

    override fun nextCharacter(char: String): IntegerState {
        return if (isInteger(char)) {
            Valid()
        } else {
            Invalid()
        }
    }
}