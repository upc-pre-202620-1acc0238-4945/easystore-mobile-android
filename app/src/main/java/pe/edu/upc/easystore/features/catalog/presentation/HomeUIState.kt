package pe.edu.upc.easystore.features.catalog.presentation

import pe.edu.upc.easystore.features.catalog.domain.Product

data class HomeUIState (
    val products: List<Product> = emptyList(),
    val isLoading: Boolean = false,
    val errorMessage: String? = null
)