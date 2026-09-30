package pe.edu.upc.easystore.features.catalog.infrastructure.local

import androidx.room3.ColumnInfo
import androidx.room3.Entity
import androidx.room3.PrimaryKey

@Entity(tableName = "products")
data class ProductEntity(
    @PrimaryKey
    val id: Int,
    val name: String,
    val price: Double,
    @ColumnInfo(name = "image_url")
    val imageUrl: String,
    val description: String,
    val rating: Double
)
