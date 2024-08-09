package org.example.state.emailState

class Part3: EmailState() {
    override fun nextCharacter(char: String) {
        require (char.length == 1) {
            "This function takes exactly one character."
        }
        TODO("Not yet implemented")
    }
}