package pe.edu.upc.easystore.features.cart.application

import pe.edu.upc.easystore.features.cart.domain.CartRepository
import javax.inject.Inject

class AddCartItemUseCase @Inject constructor(private val repository: CartRepository) {

    suspend operator fun invoke(productId: Int, quantity: Int): Result<Unit> =
        repository.addCartItem(productId, quantity)
}