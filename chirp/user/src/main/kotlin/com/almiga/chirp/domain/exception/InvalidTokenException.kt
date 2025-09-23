package com.almiga.chirp.domain.exception

import java.lang.RuntimeException


class InvalidTokenException(
    override val message: String?
): RuntimeException(
    message ?: "Invalid token"
)