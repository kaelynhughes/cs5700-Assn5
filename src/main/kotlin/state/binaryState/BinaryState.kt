package org.example.state.binaryState

import org.example.state.State
import org.example.state.integerState.IntegerState

abstract class BinaryState: State() {
    override fun getValidity(): Boolean {
        return false
    }
    abstract fun nextCharacter(char: String): IntegerState
}