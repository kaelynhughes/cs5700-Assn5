package org.example.state.emailState

class Empty: EmailState() {
    override fun nextCharacter(char: String): EmailState {
        require (char.length == 1) {
            "This function takes exactly one character."
        }
        return if (char == " " || char == "@") {
            Invalid()
        } else {
            Part1()
        }
    }
}