package org.example.state.integerState

import org.example.state.State

abstract class IntegerState: State() {
    override fun getValidity(): Boolean {
        return false
    }
    abstract fun nextCharacter(char: String): IntegerState
    fun isInteger(char: String): Boolean {
        val ints = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9")
        return ints.contains(char)
    }
}