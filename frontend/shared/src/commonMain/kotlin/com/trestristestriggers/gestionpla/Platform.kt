package com.trestristestriggers.gestionpla

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform