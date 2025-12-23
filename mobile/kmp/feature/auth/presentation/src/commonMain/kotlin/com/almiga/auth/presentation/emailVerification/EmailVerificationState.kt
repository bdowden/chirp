package com.almiga.auth.presentation.emailVerification

data class EmailVerificationState(
    val isVerifying: Boolean = false,
    val isVerified: Boolean = false
)