package org.example.concreteDetectors

import org.example.Detector
import org.example.state.emailState.*

class EmailDetector: Detector() {
    var state: EmailState = Empty1()
    override fun detectValidity(string: String): Boolean {
        val chars = splitString(string)
        state = Empty1()
        for (char in chars) {
            state = state.nextCharacter(char)
        }
        return state.getValidity()
    }
}