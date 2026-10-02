package pe.edu.upc.easystore.features.auth.infrastructure.remote

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface AuthService {

    @POST("users/login")
    @Headers("Content-Type: application/json")
    suspend fun login(@Body requestDto: LoginRequestDto): Response<LoginResponseDto>
}