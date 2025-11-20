package com.almiga.chirp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform