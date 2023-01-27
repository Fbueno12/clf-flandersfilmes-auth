package br.com.clf.app.controllers

import br.com.clf.app.config.*
import br.com.clf.app.entities.dto.DefaultResponse
import br.com.clf.app.entities.dto.UserDTO
import br.com.clf.app.services.TokenService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/auth")
class AuthenticationController(val tokenService: TokenService) {

    @PostMapping
    fun generate(
        @RequestHeader(value = H_CLIENT_ID) clientId: String,
        @RequestHeader(value = H_CLIENT_SEED) clientSeed: String,
        @RequestBody userDto: UserDTO
    ): ResponseEntity<DefaultResponse> {
        val result = tokenService.generate(clientId, clientSeed, userDto)
        return ResponseEntity.ok().body(DefaultResponse(result))
    }

}