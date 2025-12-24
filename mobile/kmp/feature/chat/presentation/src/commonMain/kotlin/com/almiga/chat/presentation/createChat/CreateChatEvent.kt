package com.almiga.chat.presentation.createChat

import com.almiga.chat.domain.models.Chat

sealed interface CreateChatEvent {
    data class OnChatCreated(val chat: Chat): CreateChatEvent
}