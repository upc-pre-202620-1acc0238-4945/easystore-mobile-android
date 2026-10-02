package pe.edu.upc.easystore.features.cart.infrastructure.repositories

import pe.edu.upc.easystore.features.cart.domain.Cart
import pe.edu.upc.easystore.features.cart.domain.CartItem
import pe.edu.upc.easystore.features.cart.domain.CartRepository
import pe.edu.upc.easystore.features.cart.infrastructure.remote.AddCartItemRequestDto
import pe.edu.upc.easystore.features.cart.infrastructure.remote.CartService
import javax.inject.Inject

class CartRepositoryImpl @Inject constructor(private val service: CartService) : CartRepository {
    override suspend fun getCart(): Result<Cart> {

        try {
            val response = service.getCart()

            if (response.isSuccessful) {
                response.body()?.let { cartDto ->
                    val cart = Cart(
                        cartItems = cartDto.cartItems.map { cartItemDto ->
                            CartItem(
                                productId = cartItemDto.productId,
                                name = cartItemDto.title,
                                price = cartItemDto.price,
                                image = cartItemDto.image,
                                category = cartItemDto.category,
                                quantity = cartItemDto.quantity

                            )
                        }.toList()
                    )
                    return Result.success(cart)
                }
            }
            return Result.failure(exception = Exception(response.message()))
        } catch (exception: Exception) {
            return Result.failure(exception)
        }
    }

    override suspend fun addCartItem(
        productId: Int,
        quantity: Int
    ): Result<Unit> {
        try {
            val response = service.addCartIem(AddCartItemRequestDto(productId, quantity))
            if (response.isSuccessful) {
                return Result.success(Unit)
            }
            return Result.failure(Exception(response.message()))
        } catch (exception: Exception) {
            return Result.failure(exception)
        }
    }
}