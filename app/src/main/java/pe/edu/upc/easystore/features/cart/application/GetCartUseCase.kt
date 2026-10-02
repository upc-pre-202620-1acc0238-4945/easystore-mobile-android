package pe.edu.upc.easystore.features.cart.application

import pe.edu.upc.easystore.features.cart.domain.Cart
import pe.edu.upc.easystore.features.cart.domain.CartRepository
import javax.inject.Inject

class GetCartUseCase @Inject constructor(private val repository: CartRepository) {

    suspend operator fun invoke(): Result<Cart> =
        repository.getCart()
}