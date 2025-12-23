package com.almiga.auth.presentation.resetPassword

import androidx.compose.foundation.text.input.TextFieldState
import com.almiga.core.presentation.util.UiText

data class ResetPasswordState(
    val passwordTextState: TextFieldState = TextFieldState(),
    val isLoading: Boolean = false,
    val errorText: UiText? = null,
    val isPasswordVisible: Boolean = false,
    val canSubmit: Boolean = false,
    val isResetSuccessful: Boolean = false
)

