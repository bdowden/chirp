package com.almiga.auth.presentation.login

sealed interface LoginEvent {
    data object Success: LoginEvent
}