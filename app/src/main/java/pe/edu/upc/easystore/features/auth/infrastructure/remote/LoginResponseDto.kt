package pe.edu.upc.easystore.features.auth.infrastructure.remote

import com.google.gson.annotations.SerializedName

data class LoginResponseDto(
    @SerializedName("email")
    val username: String,
    val firstName: String,
    val lastName: String,
    @SerializedName("token")
    val accessToken: String
)
