package org.example.state.emailState

class Invalid: EmailState() {
    override fun nextCharacter(char: String): EmailState {
        require (char.length == 1) {
            "This function takes exactly one character."
        }
        TODO("Not yet implemented")
    }
}