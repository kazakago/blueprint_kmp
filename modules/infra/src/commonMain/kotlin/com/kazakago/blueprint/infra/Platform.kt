package com.kazakago.blueprint.infra

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
