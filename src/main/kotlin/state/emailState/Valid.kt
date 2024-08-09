package org.example.state.emailState

class Valid: EmailState() {
    override fun getValidity(): Boolean {
        return true
    }
    override fun nextCharacter(char: String): EmailState {
        require (char.length == 1) {
            "This function takes exactly one character."
        }
        return if (char == " " || char == "@" || char == ".") {
            Invalid()
        } else {
            this
        }
    }
}