package pe.edu.upc.easystore.features.auth.infrastructure.repositories

import pe.edu.upc.easystore.features.auth.domain.AuthRepository
import pe.edu.upc.easystore.features.auth.domain.User
import pe.edu.upc.easystore.features.auth.infrastructure.local.TokenManager
import pe.edu.upc.easystore.features.auth.infrastructure.remote.AuthService
import pe.edu.upc.easystore.features.auth.infrastructure.remote.LoginRequestDto
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(
    private val service: AuthService,
    private val tokenManager: TokenManager
    ) : AuthRepository {
    override suspend fun login(
        username: String,
        password: String
    ): Result<User> {
        try {
            val response = service.login(LoginRequestDto(username, password))

            if (response.isSuccessful) {
                response.body()?.let { dto ->
                    val user = User(
                        username = dto.username,
                        lastName = dto.lastName,
                        firstName = dto.firstName,
                    )
                    tokenManager.saveToken(dto.accessToken)
                    return Result.success(user)
                }
            }
            return Result.failure(Exception(response.message()))
        } catch (e: Exception) {
            return Result.failure(e)

        }
    }
}