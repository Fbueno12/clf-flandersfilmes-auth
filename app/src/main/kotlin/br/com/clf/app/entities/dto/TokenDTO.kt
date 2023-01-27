package br.com.clf.app.entities.dto

import java.time.LocalDateTime

data class DefaultResponse(
    val data: TokenDTO
)
data class TokenDTO(
    val authorization: String,
    val expiration: LocalDateTime
)