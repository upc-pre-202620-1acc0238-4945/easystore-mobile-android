package pe.edu.upc.easystore.features.catalog.infrastructure

import pe.edu.upc.easystore.features.catalog.domain.Product
import pe.edu.upc.easystore.features.catalog.domain.ProductRepository

class InMemoryRepository: ProductRepository {

    private val _products = listOf(
        Product(
            id = 1,
            name = "Product 1",
            description = "Description 1",
            price = 10.0,
            rating = 4.5,
            imageUrl = "https://cdn.dummyjson.com/product-images/beauty/essence-mascara-lash-princess/thumbnail.webp"
        ),
        Product(
            id = 2,
            name = "Product 2",
            description = "Description 2",
            price = 20.0,
            rating = 4.0,
            imageUrl = "https://cdn.dummyjson.com/product-images/beauty/eyeshadow-palette-with-mirror/thumbnail.webp"
        )
    )
    override fun getProducts(): List<Product> {
        return _products
    }
}