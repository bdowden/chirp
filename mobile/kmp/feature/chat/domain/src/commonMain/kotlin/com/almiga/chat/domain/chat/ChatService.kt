package com.almiga.chat.domain.chat

import com.almiga.chat.domain.models.Chat
import com.almiga.core.domain.util.DataError
import com.almiga.core.domain.util.Result

interface ChatService {
    suspend fun createChat(
        otherUserIds: List<String>
    ): Result<Chat, DataError.Remote>
}