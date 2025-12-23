package com.almiga.chat.presentation.di

import com.almiga.chat.presentation.chatListDetail.ChatListDetailViewModel
import com.almiga.chat.presentation.chatList.ChatListViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val chatPresentationModule = module {
    viewModelOf(::ChatListViewModel)
    viewModelOf(::ChatListDetailViewModel)
}