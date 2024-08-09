package org.example.state.emailState

class Empty3: EmailState() {
    override fun nextCharacter(char: String): EmailState {
        require (char.length == 1) {
            "This function takes exactly one character."
        }
        return if (char == " " || char == "@" || char == ".") {
            Invalid()
        } else {
            Part3()
        }
    }
}
