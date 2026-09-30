package pe.edu.upc.easystore.features.auth.application

import pe.edu.upc.easystore.features.auth.domain.AuthRepository
import javax.inject.Inject

class LoginUseCase @Inject constructor(private val repository: AuthRepository) {

    suspend operator fun invoke(username: String, password: String) = repository.login(username, password)
}