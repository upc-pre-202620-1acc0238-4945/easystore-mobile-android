package pe.edu.upc.easystore.features.auth.infrastructure.remote

data class LoginResponseDto(
    val id: Int,
    val username: String,
    val firstName: String,
    val lastName: String,
    val gender: String,
    val image: String,
    val accessToken: String,
    val refreshToken: String
)
