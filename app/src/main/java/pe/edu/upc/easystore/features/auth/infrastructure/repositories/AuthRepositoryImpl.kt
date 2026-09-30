package pe.edu.upc.easystore.features.auth.infrastructure.repositories

import pe.edu.upc.easystore.features.auth.domain.AuthRepository
import pe.edu.upc.easystore.features.auth.domain.User
import pe.edu.upc.easystore.features.auth.infrastructure.remote.AuthService
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(private val service: AuthService): AuthRepository {
    override suspend fun login(
        username: String,
        password: String
    ): Result<User> {
        TODO("Not yet implemented")
    }
}