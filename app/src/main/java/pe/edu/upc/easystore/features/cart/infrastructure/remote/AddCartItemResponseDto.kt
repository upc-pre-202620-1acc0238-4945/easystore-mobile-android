package pe.edu.upc.easystore.features.cart.infrastructure.remote

data class AddCartItemResponseDto(
    val message: String,
    val productId: Int,
    val quantity: Int
)
