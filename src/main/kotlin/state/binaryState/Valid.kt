package org.example.state.binaryState

class Valid: BinaryState() {
    override fun getValidity(): Boolean {
        return true
    }

    override fun nextCharacter(char: String): BinaryState {
        require (char.length == 1) {
            "This function takes exactly one character."
        }
        return if (char == "1") {
            this
        } else if (char == "0") {
            ValidUnfinished()
        } else {
            Invalid()
        }
    }
}