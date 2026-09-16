package pe.edu.upc.easystore.features.catalog.application

import pe.edu.upc.easystore.features.catalog.domain.ProductRepository
import javax.inject.Inject

class GetProductByIdUseCase @Inject constructor(private val repository: ProductRepository) {

    suspend operator fun invoke(id: Int) = repository.getProductById(id)
}