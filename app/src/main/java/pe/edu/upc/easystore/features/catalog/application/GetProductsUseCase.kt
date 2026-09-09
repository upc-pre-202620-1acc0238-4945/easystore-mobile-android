package pe.edu.upc.easystore.features.catalog.application

import pe.edu.upc.easystore.features.catalog.domain.ProductRepository
import pe.edu.upc.easystore.features.catalog.infrastructure.InMemoryRepository

class GetProductsUseCase(private val repository: ProductRepository = InMemoryRepository()) {

    suspend operator fun invoke() = repository.getProducts()
}