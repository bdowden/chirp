package com.almiga.chat.data.mappers

import com.almiga.chat.data.dto.ChatParticipantDto
import com.almiga.chat.domain.models.ChatParticipant

fun ChatParticipantDto.toDomain(): ChatParticipant {
    return ChatParticipant(
        userId = userId,
        username = username,
        profilePictureUrl = profilePictureUrl
    )
}