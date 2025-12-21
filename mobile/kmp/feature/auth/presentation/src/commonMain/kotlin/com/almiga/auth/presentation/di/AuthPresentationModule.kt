package com.almiga.auth.presentation.di

import com.almiga.auth.presentation.register.RegisterViewModel
import com.almiga.auth.presentation.success.RegisterSuccessViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val authPresentationModule = module {
    viewModelOf(::RegisterViewModel)
    viewModelOf(::RegisterSuccessViewModel)
}