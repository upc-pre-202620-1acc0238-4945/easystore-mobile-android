package pe.edu.upc.easystore.features.catalog.application

import pe.edu.upc.easystore.features.catalog.domain.ProductRepository
import javax.inject.Inject

class GetProductsUseCase @Inject constructor(private val repository: ProductRepository) {

    suspend operator fun invoke() = repository.getProducts()
}