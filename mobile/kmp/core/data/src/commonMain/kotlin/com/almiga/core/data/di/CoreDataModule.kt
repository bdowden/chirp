package com.almiga.core.data.di

import com.almiga.core.data.auth.KtorAuthService
import com.almiga.core.data.logging.KermitLogger
import com.almiga.core.data.networking.HttpClientFactory
import com.almiga.core.domain.auth.AuthService
import com.almiga.core.domain.loggin.ChirpLogger
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

expect val platformCoreDataModule: Module

val coreDataModule = module {
    includes(platformCoreDataModule)
    single<ChirpLogger> { KermitLogger }
    single {
        HttpClientFactory(get()).create(get())
    }
    singleOf(::KtorAuthService) bind AuthService::class
}