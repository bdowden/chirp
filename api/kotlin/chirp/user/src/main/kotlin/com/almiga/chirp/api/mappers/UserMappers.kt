package com.almiga.chirp.api.mappers

import com.almiga.chirp.api.dto.AuthenticatedUserDto
import com.almiga.chirp.api.dto.UserDto
import com.almiga.chirp.domain.model.AuthenticatedUser
import com.almiga.chirp.domain.model.User

fun AuthenticatedUser.toAuthenticatedUserDto(): AuthenticatedUserDto {
    return AuthenticatedUserDto(
        user = user.toUserDto(),
        accessToken = accessToken,
        refreshToken = refreshToken
    )
}

fun User.toUserDto(): UserDto {
    return UserDto(
        id = id,
        email = email,
        username = username,
        hasVerifiedEmail = hasEmailVerified
    )
}