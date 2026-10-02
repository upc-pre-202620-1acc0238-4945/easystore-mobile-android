package pe.edu.upc.easystore.features.cart.presentation.cart

import pe.edu.upc.easystore.features.cart.domain.Cart

data class CartUiState(
    val isLoading: Boolean = false,
    val cart: Cart = Cart(emptyList()),
    val errorMessage: String? = null
)

