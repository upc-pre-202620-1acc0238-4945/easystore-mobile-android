package pe.edu.upc.easystore.features.catalog.infrastructure.local

import androidx.room3.Dao
import androidx.room3.Delete
import androidx.room3.Insert
import androidx.room3.Query

@Dao
interface ProductDao {

    @Query("SELECT * FROM products")
    suspend fun fetchProducts(): List<ProductEntity>

    @Insert
    suspend fun insertProduct(product: ProductEntity)

    @Delete
    suspend fun deleteProduct(product: ProductEntity)
}