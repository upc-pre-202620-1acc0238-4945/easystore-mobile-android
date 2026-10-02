package pe.edu.upc.easystore.features.cart.infrastructure.remote

data class AddCartItemRequestDto(
    val productId: Int,
    val quantity: Int
)
