package com.almiga.chat.data.chat

import com.almiga.chat.data.dto.ChatDto
import com.almiga.chat.data.dto.request.CreateChatRequest
import com.almiga.chat.data.mappers.toDomain
import com.almiga.chat.domain.chat.ChatService
import com.almiga.chat.domain.models.Chat
import com.almiga.core.data.networking.post
import com.almiga.core.domain.util.DataError
import com.almiga.core.domain.util.Result
import com.almiga.core.domain.util.map
import io.ktor.client.HttpClient

class KtorChatService(
    private val httpClient: HttpClient
): ChatService {

    override suspend fun createChat(otherUserIds: List<String>): Result<Chat, DataError.Remote> {
        return httpClient.post<CreateChatRequest, ChatDto>(
            route = "/chat",
            body = CreateChatRequest(
                otherUserIds = otherUserIds
            )
        ).map { it.toDomain() }
    }
}