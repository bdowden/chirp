package com.almiga.chirp.api.controllers

import com.almiga.chirp.api.dto.AuthenticatedUserDto
import com.almiga.chirp.api.dto.LoginRequest
import com.almiga.chirp.api.dto.RegisterRequest
import com.almiga.chirp.api.dto.UserDto
import com.almiga.chirp.api.mappers.toAuthenticatedUserDto
import com.almiga.chirp.api.mappers.toUserDto
import com.almiga.chirp.service.auth.AuthService
import jakarta.validation.Valid
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/auth")
class AuthController(private val authService: AuthService) {

    @PostMapping("/register")
    fun register(
        @Valid @RequestBody body: RegisterRequest
    ): UserDto {
        return authService.register(
            email = body.email,
            username = body.username,
            password = body.password
        ).toUserDto()
    }

    @PostMapping("/login")
    fun login(
        @RequestBody body: LoginRequest
    ): AuthenticatedUserDto {
        return authService.login(
            email = body.email,
            password = body.password
        ).toAuthenticatedUserDto()
    }
}