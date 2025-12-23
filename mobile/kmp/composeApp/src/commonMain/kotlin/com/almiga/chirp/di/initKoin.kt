package com.almiga.chirp.di

import com.almiga.auth.presentation.di.authPresentationModule
import com.almiga.chat.data.di.chatDataModule
import com.almiga.chat.presentation.di.chatPresentationModule
import com.almiga.core.data.di.coreDataModule
import com.almiga.core.presentation.di.corePresentationModule
import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration

fun initKoin(config: KoinAppDeclaration? = null) {
    startKoin {
        config?.invoke(this)
        modules(
            coreDataModule,
            authPresentationModule,
            appModule,
            chatPresentationModule,
            corePresentationModule,
            chatDataModule,
        )
    }
}