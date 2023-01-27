package br.com.clf.app.services

import br.com.clf.app.entities.dto.TokenDTO
import br.com.clf.app.entities.dto.UserDTO
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class TokenService {
    fun generate(clientId: String, clientSeed: String, dto: UserDTO): TokenDTO {
        // TODO Create initial generation for token
        return TokenDTO("some", LocalDateTime.now())
    }


}