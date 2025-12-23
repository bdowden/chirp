package com.almiga.auth.presentation.resetPassword

sealed interface ResetPasswordAction {
    data object OnSubmitClick: ResetPasswordAction
    data object OnTogglePasswordVisibilityClick: ResetPasswordAction
}