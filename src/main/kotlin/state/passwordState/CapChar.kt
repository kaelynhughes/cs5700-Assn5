package org.example.state.passwordState

class CapChar: PasswordState() {
    override fun nextCharacter(char: String): PasswordState {
        require (char.length == 1) {
            "This function takes exactly one character."
        }
        return this
    }

    override fun nextCharLong(char: String): PasswordState {
        require (char.length == 1) {
            "This function takes exactly one character."
        }
        return if (isCapital(char) || isLower(char) || isNumber(char)) {
            Valid()
        } else {
            CapCharLong()
        }
    }
}