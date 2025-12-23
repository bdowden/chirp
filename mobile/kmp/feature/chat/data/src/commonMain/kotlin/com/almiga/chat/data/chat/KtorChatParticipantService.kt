package com.almiga.chat.data.chat

import com.almiga.chat.data.dto.ChatParticipantDto
import com.almiga.chat.data.mappers.toDomain
import com.almiga.chat.domain.chat.ChatParticipantService
import com.almiga.chat.domain.models.ChatParticipant
import com.almiga.core.data.networking.get
import com.almiga.core.domain.util.DataError
import com.almiga.core.domain.util.Result
import com.almiga.core.domain.util.map
import io.ktor.client.HttpClient

class KtorChatParticipantService(
    private val httpClient: HttpClient
): ChatParticipantService {

    override suspend fun searchParticipant(query: String): Result<ChatParticipant, DataError.Remote> {
        return httpClient.get<ChatParticipantDto>(
            route = "/participants",
            queryParams = mapOf(
                "query" to query
            )
        ).map { it.toDomain() }
    }
}