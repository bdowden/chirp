package com.almiga.core.data.auth

import com.almiga.core.data.dto.request.EmailRequest
import com.almiga.core.data.dto.request.RegisterRequest
import com.almiga.core.data.networking.post
import com.almiga.core.domain.auth.AuthService
import com.almiga.core.domain.util.DataError
import com.almiga.core.domain.util.EmptyResult
import io.ktor.client.HttpClient

class KtorAuthService(
    private val httpClient: HttpClient
): AuthService {

    override suspend fun register(
        email: String,
        username: String,
        password: String
    ): EmptyResult<DataError.Remote> {
        return httpClient.post(
            route = "/auth/register",
            body = RegisterRequest(
                email = email,
                username = username,
                password = password
            )
        )
    }

    override suspend fun resendVerificationEmail(email: String): EmptyResult<DataError.Remote> {
        return httpClient.post(
            route = "/auth/resend-verification",
            body = EmailRequest(email),
        )
    }
}