package org.example

import org.example.concreteDetectors.IntegerDetector

fun main() {
    val detector = IntegerDetector()
    println(detector.detectValidity("232132"))
}