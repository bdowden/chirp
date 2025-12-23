package com.almiga.auth.presentation.di

import com.almiga.auth.presentation.emailVerification.EmailVerificationViewModel
import com.almiga.auth.presentation.forgotPassword.ForgotPasswordViewModel
import com.almiga.auth.presentation.login.LoginViewModel
import com.almiga.auth.presentation.register.RegisterViewModel
import com.almiga.auth.presentation.resetPassword.ResetPasswordViewModel
import com.almiga.auth.presentation.success.RegisterSuccessViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val authPresentationModule = module {
    viewModelOf(::RegisterViewModel)
    viewModelOf(::RegisterSuccessViewModel)
    viewModelOf(::EmailVerificationViewModel)
    viewModelOf(::LoginViewModel)
    viewModelOf(::ForgotPasswordViewModel)
    viewModelOf(::ResetPasswordViewModel)
}