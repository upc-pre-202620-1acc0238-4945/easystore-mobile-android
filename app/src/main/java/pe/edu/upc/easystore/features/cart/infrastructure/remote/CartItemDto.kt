package pe.edu.upc.easystore.features.cart.infrastructure.remote

data class CartItemDto (
    val productId: Int,
    val title: String,
    val price: Double,
    val image: String,
    val category: String,
    val quantity: Int
)
