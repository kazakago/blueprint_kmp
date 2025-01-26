package com.kazakago.blueprint.ui

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
