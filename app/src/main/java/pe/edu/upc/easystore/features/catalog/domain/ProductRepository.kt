package pe.edu.upc.easystore.features.catalog.domain

interface ProductRepository {
    fun getProducts(): List<Product>
}