package org.example.state.binaryState

class ValidUnfinished: BinaryState() {
    override fun nextCharacter(char: String): BinaryState {
        require (char.length == 1) {
            "This function takes exactly one character."
        }
        return if (char == "1") {
            Valid()
        } else if (char == "0") {
            this
        } else {
            Invalid()
        }
    }
}