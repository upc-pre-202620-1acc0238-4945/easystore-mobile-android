package pe.edu.upc.easystore.features.catalog.infrastructure.local

import androidx.room3.Dao
import androidx.room3.Query
import androidx.room3.Upsert

@Dao
interface ProductDao {

    @Query("SELECT * FROM products")
    suspend fun fetchAlProducts(): List<ProductEntity>

    @Upsert
    suspend fun insertProducts(entities: List<ProductEntity>)

    @Query("SELECT * FROM products where id = :id")
    suspend fun fetchProductById(id: Int): ProductEntity?

}