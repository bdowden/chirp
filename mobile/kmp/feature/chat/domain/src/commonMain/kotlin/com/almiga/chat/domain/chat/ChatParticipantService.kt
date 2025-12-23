package com.almiga.chat.domain.chat

import com.almiga.chat.domain.models.ChatParticipant
import com.almiga.core.domain.util.DataError
import com.almiga.core.domain.util.Result

interface ChatParticipantService {
    suspend fun searchParticipant(
        query: String
    ): Result<ChatParticipant, DataError.Remote>
}

