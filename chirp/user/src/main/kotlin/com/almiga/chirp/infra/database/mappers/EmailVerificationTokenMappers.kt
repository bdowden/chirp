package com.almiga.chirp.infra.database.mappers

import com.almiga.chirp.domain.model.EmailVerificationToken
import com.almiga.chirp.infra.database.entities.EmailVerificationTokenEntity

fun EmailVerificationTokenEntity.toEmailVerificationToken(): EmailVerificationToken {
    return EmailVerificationToken(
        id = id,
        token = token,
        user = user.toUser()
    )
}