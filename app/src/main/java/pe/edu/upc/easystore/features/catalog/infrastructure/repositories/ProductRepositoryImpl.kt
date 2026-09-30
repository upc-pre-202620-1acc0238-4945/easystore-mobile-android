package pe.edu.upc.easystore.features.catalog.infrastructure.repositories

import pe.edu.upc.easystore.features.catalog.domain.Product
import pe.edu.upc.easystore.features.catalog.domain.ProductRepository
import pe.edu.upc.easystore.features.catalog.infrastructure.local.ProductDao
import pe.edu.upc.easystore.features.catalog.infrastructure.local.ProductEntity
import pe.edu.upc.easystore.features.catalog.infrastructure.remote.ProductService
import javax.inject.Inject

class ProductRepositoryImpl @Inject constructor(
    private val service: ProductService,
    private val dao: ProductDao
) : ProductRepository {
    override suspend fun getProducts(): List<Product> {

        try {
            val response = service.getProducts()

            if (response.isSuccessful) {
                response.body()?.let { productsResponseDto ->
                    val entities = productsResponseDto.products.map { dto ->
                        ProductEntity(
                            id = dto.id,
                            name = dto.title,
                            description = dto.description,
                            price = dto.price,
                            rating = dto.rating,
                            imageUrl = dto.thumbnail
                        )
                    }.toList()
                    dao.insertProducts(entities)
                }
            }
        } catch (_: Exception) {

        }

        val entities = dao.fetchAlProducts()

        return entities.map { entity ->
            Product(
                id = entity.id,
                name = entity.name,
                description = entity.description,
                price = entity.price,
                rating = entity.rating,
                imageUrl = entity.imageUrl
            )
        }.toList()

    }

    override suspend fun getProductById(id: Int): Product? {

        try {
            val response = service.getProductById(id)

            if (response.isSuccessful) {
                response.body()?.let { dto ->
                    val entity = ProductEntity(
                        id = dto.id,
                        name = dto.title,
                        description = dto.description,
                        price = dto.price,
                        rating = dto.rating,
                        imageUrl = dto.thumbnail
                    )
                    dao.insertProducts(listOf(entity))
                }
            }
        } catch (_: Exception) {

        }

        val entity = dao.fetchProductById(id)

        entity?.let { entity ->
            return Product(
                id = entity.id,
                name = entity.name,
                description = entity.description,
                price = entity.price,
                rating = entity.rating,
                imageUrl = entity.imageUrl
            )
        }
        return null
    }
}