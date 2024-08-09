package org.example.state.passwordState

class CharLong: PasswordState() {
    override fun nextCharacter(char: String): PasswordState {
        require (char.length == 1) {
            "This function takes exactly one character."
        }
        return nextCharLong(char)
    }
    override fun nextCharLong(char: String): PasswordState {
        require (char.length == 1) {
            "This function takes exactly one character."
        }
        return if (isCapital(char)) {
            Valid()
        } else {
            this
        }
    }
}