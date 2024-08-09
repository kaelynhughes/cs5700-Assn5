package org.example.state.integerState

class Valid: IntegerState() {
    override fun getValidity(): Boolean {
        return true
    }
    override fun nextCharacter(char: String): IntegerState {
        require (char.length == 1) {
            "This function takes exactly one character."
        }
        return if (isInteger(char)) {
            this
        } else {
            Invalid()
        }
    }
}