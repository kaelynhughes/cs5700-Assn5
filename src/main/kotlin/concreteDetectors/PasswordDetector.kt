package org.example.concreteDetectors

import org.example.Detector
import org.example.state.passwordState.*

class PasswordDetector: Detector() {
    var state: PasswordState = TooShort()
    override fun detectValidity(string: String): Boolean {
        val chars: List<String> = splitString(string)
        state = TooShort()
        chars.forEachIndexed {index, char ->
            state = if (index < 7) {
                state.nextCharacter(char)
            } else {
                state.nextCharLong(char)
            }
            println(state)
        }
        return state.getValidity()
    }
}