package pe.edu.upc.easystore.features.catalog.infrastructure.remote

import retrofit2.Response
import retrofit2.http.GET

interface ProductService {

    @GET("products")
    suspend fun getProducts(): Response<ProductsResponseDto>
}