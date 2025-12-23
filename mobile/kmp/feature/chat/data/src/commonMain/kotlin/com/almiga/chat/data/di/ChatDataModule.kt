package com.almiga.chat.data.di

import com.almiga.chat.data.chat.KtorChatParticipantService
import com.almiga.chat.domain.chat.ChatParticipantService
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val chatDataModule = module {
    singleOf(::KtorChatParticipantService) bind ChatParticipantService::class
}