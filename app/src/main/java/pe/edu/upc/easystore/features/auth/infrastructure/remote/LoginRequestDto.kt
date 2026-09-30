package pe.edu.upc.easystore.features.auth.infrastructure.remote

data class LoginRequestDto(
    val username: String,
    val password: String
)