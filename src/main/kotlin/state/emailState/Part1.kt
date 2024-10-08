package org.example.state.emailState

class Part1: EmailState() {
    override fun nextCharacter(char: String): EmailState {
        require (char.length == 1) {
            "This function takes exactly one character."
        }
        return if (char == " ") {
            Invalid()
        } else if (char == "@") {
            Empty2()
        } else {
            this
        }
    }
}