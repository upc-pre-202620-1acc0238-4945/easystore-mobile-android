package pe.edu.upc.easystore.features.auth.application

import pe.edu.upc.easystore.features.auth.domain.AuthRepository
import pe.edu.upc.easystore.features.auth.domain.User
import javax.inject.Inject

class LoginUseCase @Inject constructor(private val repository: AuthRepository) {

    suspend operator fun invoke(username: String, password: String): Result<User> =
        repository.login(username, password)
}