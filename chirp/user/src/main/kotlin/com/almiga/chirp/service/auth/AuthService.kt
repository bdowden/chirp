package com.almiga.chirp.service.auth
import com.almiga.chirp.domain.exception.UserAlreadyExistsException
import com.almiga.chirp.domain.model.User
import com.almiga.chirp.infra.database.entities.UserEntity
import com.almiga.chirp.infra.database.mappers.toUser
import com.almiga.chirp.infra.database.repositories.UserRepository
import com.almiga.chirp.infra.security.PasswordEncoder
import org.springframework.stereotype.Service

@Service
class AuthService(
    private val userRepository: UserRepository,
    private val passwordEncoder: PasswordEncoder
) {

    fun register(email: String, username: String, password: String): User {
        val user = userRepository.findByEmailOrUsername(
            email = email.trim(),
            username = username.trim()
        )
        if(user != null) {
            throw UserAlreadyExistsException()
        }

        val savedUser = userRepository.save(
            UserEntity(
                email = email.trim(),
                username = username.trim(),
                hashedPassword = passwordEncoder.encode(password)
            )
        ).toUser()

        return savedUser
    }
}