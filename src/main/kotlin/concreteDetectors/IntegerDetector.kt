package org.example.concreteDetectors

import org.example.Detector
import org.example.state.integerState.*

class IntegerDetector: Detector() {
    var state: IntegerState = Empty()
    override fun detectValidity(string: String): Boolean {
        val chars = splitString(string)
        for (char in chars) {
            state = state.nextCharacter(char)
        }
        return state.getValidity()
    }
}