package com.almiga.core.domain.loggin

interface ChirpLogger {
    fun debug(message: String)
    fun info(message: String)
    fun warning(message: String)
    fun error(message: String, throwable: Throwable? = null)
}