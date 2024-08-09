package org.example.state.passwordState

class TooShort: PasswordState() {
    override fun nextCharacter(char: String): PasswordState {
        return if (isCapital(char)) {
            Cap()
        } else if (isLower(char) || isNumber(char)) {
            TooShort()
        } else {
            Char()
        }
    }
    override fun nextCharLong(char: String): PasswordState {
        TODO("Not yet implemented")
    }
}