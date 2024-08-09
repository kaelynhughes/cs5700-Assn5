package org.example.concreteDetectors

import org.example.Detector
import org.example.state.floatState.FloatState
import org.example.state.floatState.*

class FloatDetector: Detector() {
    var state: FloatState = Empty()
    override fun detectValidity(string: String): Boolean {
        val chars = splitString(string)
        state = Empty()
        for (char in chars) {
            state = state.nextCharacter(char)
        }
        return state.getValidity()
    }
}