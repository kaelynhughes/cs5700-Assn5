package org.example.state.passwordState

class SpecialChar: PasswordState() {
    override fun nextCharacter(char: String): PasswordState {
        require (char.length == 1) {
            "This function takes exactly one character."
        }
        return if (isCapital(char)) {
            CapChar()
        } else {
            this
        }
    }
    override fun nextCharLong(char: String): PasswordState {
        require (char.length == 1) {
            "This function takes exactly one character."
        }
        return if (isCapital(char)) {
            Valid()
        } else {
            CharLong()
        }
    }
}