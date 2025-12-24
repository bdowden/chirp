package com.almiga.chat.presentation.di

import com.almiga.chat.presentation.chatDetail.ChatDetailViewModel
import com.almiga.chat.presentation.chatListDetail.ChatListDetailViewModel
import com.almiga.chat.presentation.chatList.ChatListViewModel
import com.almiga.chat.presentation.createChat.CreateChatViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val chatPresentationModule = module {
    viewModelOf(::ChatListViewModel)
    viewModelOf(::ChatListDetailViewModel)
    viewModelOf(::CreateChatViewModel)
    viewModelOf(::ChatDetailViewModel)
}