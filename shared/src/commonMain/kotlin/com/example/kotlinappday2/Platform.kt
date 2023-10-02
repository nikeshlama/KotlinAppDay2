package com.example.kotlinappday2

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform