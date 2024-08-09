package org.example.state.binaryState

import org.example.state.integerState.IntegerState

class Valid: BinaryState() {
    override fun getValidity(): Boolean {
        return true
    }

    override fun nextCharacter(char: String): IntegerState {
        require (char.length == 1) {
            "This function takes exactly one character."
        }
        TODO("Not yet implemented")
    }
}