package com.almiga.chat.presentation.mappers

import com.almiga.chat.domain.models.ChatParticipant
import com.almiga.core.designsystem.components.avatar.ChatParticipantUi

fun ChatParticipant.toUi(): ChatParticipantUi {
    return ChatParticipantUi(
        id = userId,
        username = username,
        initials = initials,
        imageUrl = profilePictureUrl
    )
}