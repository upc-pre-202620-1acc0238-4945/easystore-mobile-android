package pe.edu.upc.easystore.features.cart.domain

interface CartRepository {

    suspend fun getCart(): Result<Cart>

    suspend fun addCartItem(productId: Int, quantity: Int): Result<Unit>
}