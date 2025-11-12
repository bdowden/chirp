package com.almiga.chirp.infra.database.mappers

import com.almiga.chirp.domain.model.User
import com.almiga.chirp.infra.database.entities.UserEntity

fun UserEntity.toUser(): User {
    return User(
        id = id!!,
        username = username,
        email = email,
        hasEmailVerified = hasVerifiedEmail
    )
}