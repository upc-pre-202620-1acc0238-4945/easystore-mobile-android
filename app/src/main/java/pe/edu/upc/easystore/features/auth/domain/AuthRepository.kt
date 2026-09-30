package pe.edu.upc.easystore.features.auth.domain

interface AuthRepository {

    suspend fun login(username: String, password: String): Result<User>
}