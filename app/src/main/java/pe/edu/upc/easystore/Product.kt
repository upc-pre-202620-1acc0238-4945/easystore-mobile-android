package pe.edu.upc.easystore

data class Product(
    val id: Int,
    val name: String,
    val description: String,
    val price: Double,
    val rating: Double,
    val imageUrl: String
)
