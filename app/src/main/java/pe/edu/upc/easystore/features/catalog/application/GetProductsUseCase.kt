package pe.edu.upc.easystore.features.catalog.application

import pe.edu.upc.easystore.features.catalog.domain.ProductRepository

class GetProductsUseCase(private val repository: ProductRepository) {

    operator fun invoke() = repository.getProducts()
}