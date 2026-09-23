package pe.edu.upc.easystore.features.catalog.infrastructure.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "products")
data class ProductEntity(
    @PrimaryKey
    val id: Int,
    val name: String,
    val price: Double,
    @ColumnInfo(name = "image_url")
    val imageUrl: String
)
