package org.example.state.emailState

import org.example.state.State

abstract class EmailState: State() {
    override fun getValidity(): Boolean {
        return false
    }
    abstract fun nextCharacter(char: String): EmailState
}