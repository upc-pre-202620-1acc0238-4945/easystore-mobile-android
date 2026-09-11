package pe.edu.upc.easystore.features.catalog.infrastructure.remote

import com.google.gson.annotations.SerializedName

data class ProductsResponseDto(
    @SerializedName("products")
    val products: List<ProductDto>
)
