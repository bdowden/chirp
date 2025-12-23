package com.almiga.auth.presentation.forgotPassword

sealed interface ForgotPasswordAction {
    data object OnSubmitClick: ForgotPasswordAction
}