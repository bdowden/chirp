package com.almiga.auth.presentation.register

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import chirp.feature.auth.presentation.generated.resources.Res
import chirp.feature.auth.presentation.generated.resources.email_error
import chirp.feature.auth.presentation.generated.resources.password_validation_error
import chirp.feature.auth.presentation.generated.resources.username_error
import com.almiga.auth.domain.EmailValidator
import com.almiga.core.domain.validation.PasswordValidator
import com.almiga.core.presentation.util.UiText
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update

class RegisterViewModel : ViewModel() {
    private var hasLoadedData = false

    private val _state = MutableStateFlow(RegisterState())
    val state = _state
        .onStart {
            if (!hasLoadedData) {
                hasLoadedData = true
            }
        }
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5_000L),
            initialValue = RegisterState()
        )

    fun onAction(action: RegisterAction) {
        when(action) {

            else -> Unit
        }
    }

    private fun clearAllTextFieldErrors() {
        _state.update {
            it.copy(
                emailError = null,
                passwordError = null,
                usernameError = null,
            )
        }
    }

    private fun validateFormInputs(): Boolean {
        clearAllTextFieldErrors()
        val currentState = state.value
        val email = currentState.emailTextState.text.toString()
        val username = currentState.usernameTextState.text.toString()
        val password = currentState.passwordTextState.text.toString()

        val isEmailValid = EmailValidator.validate(email)
        val passwordValidationState = PasswordValidator.validate(password)
        val isUsernameValid = username.length in 3..20

        val emailError = if (!isEmailValid) {
            UiText.Resource(Res.string.email_error)
        } else {
            null
        }

        val usernameError = if (!isUsernameValid) {
            UiText.Resource(Res.string.username_error)
        } else {
            null
        }

        val passwordError = if (!passwordValidationState.isValidPassword) {
            UiText.Resource(Res.string.password_validation_error)
        } else {
            null
        }

        _state.update {
            it.copy(
                emailError = emailError,
                passwordError = passwordError,
                usernameError = usernameError,
            )
        }

        return isEmailValid && isUsernameValid && passwordValidationState.isValidPassword
    }
}