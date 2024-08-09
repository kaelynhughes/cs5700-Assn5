package org.example.concreteDetectors

import org.example.Detector
import org.example.state.integerState.Empty
import org.example.state.passwordState.*

class PasswordDetector: Detector() {
    var state: PasswordState = TooShort()
    override fun detectValidity(string: String): Boolean {
        val chars = splitString(string)
        state = TooShort()
        for (char in chars) {
            state = state.nextCharacter(char)
        }
        return state.getValidity()
    }
}