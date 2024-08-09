package org.example.state.passwordState

class Cap: PasswordState() {
    override fun nextCharacter(char: String): PasswordState {
        require (char.length == 1) {
            "This function takes exactly one character."
        }
        return if (isCapital(char) || isLower(char) || isNumber(char)) {
            this
        } else {
            CapChar()
        }
    }

    override fun nextCharLong(char: String): PasswordState {
        require (char.length == 1) {
            "This function takes exactly one character."
        }
        return if (isCapital(char) || isLower(char) || isNumber(char)) {
            CapLong()
        } else {
            CapCharLong()
        }
    }
}