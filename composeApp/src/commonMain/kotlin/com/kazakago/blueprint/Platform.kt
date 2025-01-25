package com.kazakago.blueprint

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform