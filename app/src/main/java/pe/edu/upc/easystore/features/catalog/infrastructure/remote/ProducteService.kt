package pe.edu.upc.easystore.features.catalog.infrastructure.remote

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ProductService {

    @GET("products")
    suspend fun getProducts(): Response<ProductsResponseDto>

    @GET("products/{id}")
    suspend fun getProductById(@Path("id") id: Int): Response<ProductDto>
}