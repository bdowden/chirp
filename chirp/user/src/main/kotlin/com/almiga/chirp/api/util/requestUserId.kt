package com.almiga.chirp.api.util

import com.almiga.chirp.domain.exception.UnauthorizedException
import com.almiga.chirp.domain.model.UserId
import org.springframework.security.core.context.SecurityContextHolder

val requestUserId: UserId
    get() = SecurityContextHolder.getContext().authentication?.principal as? UserId
        ?: throw UnauthorizedException()