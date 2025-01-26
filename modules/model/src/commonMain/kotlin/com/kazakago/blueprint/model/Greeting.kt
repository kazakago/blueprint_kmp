package com.kazakago.blueprint.model

data class Greeting(private val name: String) {
    fun greet(): String {
        return "Hello, ${name}!"
    }
}
