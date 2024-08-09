package org.example.state.binaryState

import org.example.state.integerState.IntegerState

class Invalid: BinaryState() {
    override fun nextCharacter(char: String): IntegerState {
        require (char.length == 1) {
            "This function takes exactly one character."
        }
        TODO("Not yet implemented")
    }
}