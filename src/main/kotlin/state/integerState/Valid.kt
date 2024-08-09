package org.example.state.integerState

class Valid: IntegerState() {
    override fun getValidity(): Boolean {
        return true
    }
    override fun nextCharacter(char: String): IntegerState {
        return if (isInteger(char)) {
            this
        } else {
            Invalid()
        }
    }
}