package com.almiga.auth.presentation.success

sealed interface RegisterSuccessAction {
    data object OnLoginClick: RegisterSuccessAction
    data object OnResendVerificationEmailClick: RegisterSuccessAction
}

