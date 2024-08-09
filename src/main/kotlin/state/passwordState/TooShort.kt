package org.example.state.passwordState

class TooShort: PasswordState() {
    override fun nextCharacter(char: String): PasswordState {
        require (char.length == 1) {
            "This function takes exactly one character."
        }
        return if (isCapital(char)) {
            Cap()
        } else if (isLower(char) || isNumber(char)) {
            TooShort()
        } else {
            SpecialChar()
        }
    }
    override fun nextCharLong(char: String): PasswordState {
        require (char.length == 1) {
            "This function takes exactly one character."
        }
        return if (isCapital(char)) {
            CapLong()
        } else if (isLower(char) || isNumber(char)) {
            PasswordLong()
        } else {
            CharLong()
        }
    }
}