package pe.edu.upc.easystore.features.catalog.domain

interface ProductRepository {
    suspend fun getProducts(): List<Product>
}