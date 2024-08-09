package org.example.state.binaryState

import org.example.state.State

abstract class BinaryState: State() {
    override fun getValidity(): Boolean {
        return false
    }
    abstract fun nextCharacter(char: String): BinaryState
}