package com.almiga.chirp

sealed interface MainEvent {
    data object OnSessionExpired: MainEvent
}