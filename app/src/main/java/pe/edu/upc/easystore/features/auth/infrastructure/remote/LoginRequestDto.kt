package pe.edu.upc.easystore.features.auth.infrastructure.remote

import com.google.gson.annotations.SerializedName

data class LoginRequestDto(
    @SerializedName("email")
    val username: String,
    @SerializedName("password")
    val password: String
)