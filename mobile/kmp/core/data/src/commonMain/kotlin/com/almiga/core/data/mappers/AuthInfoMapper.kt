package com.almiga.core.data.mappers

import com.almiga.core.data.dto.AuthInfoSerializable
import com.almiga.core.data.dto.UserSerializable
import com.almiga.core.domain.auth.AuthInfo
import com.almiga.core.domain.auth.User

fun AuthInfoSerializable.toDomain(): AuthInfo {
    return AuthInfo(
        accessToken = accessToken,
        refreshToken = refreshToken,
        user = user.toDomain()
    )
}

fun UserSerializable.toDomain(): User {
    return User(
        id = id,
        email = email,
        username = username,
        hasVerifiedEmail = hasVerifiedEmail,
        profilePictureUrl = profilePictureUrl
    )
}