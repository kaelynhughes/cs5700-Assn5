package org.example

abstract class Detector {
    fun splitString(string: String): List<String> {
        val list: MutableList<String> = mutableListOf()
        for (i in string.indices) {
            list.add(string.substring(i, i + 1))
        }
        return list
    }
    abstract fun detectValidity(string: String): Boolean
}