package pe.edu.upc.easystore.features.catalog.infrastructure.remote

import com.google.gson.annotations.SerializedName

data class ProductDto(
    val id: Int,
    val title: String,
    val description: String,
    val category: String,
    val price: Double,
    val rating: Double,
    val stock: Int,
    @SerializedName("image")
    val thumbnail: String
)
