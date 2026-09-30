package pe.edu.upc.easystore.features.catalog.infrastructure.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import pe.edu.upc.easystore.features.catalog.infrastructure.local.AppDatabase
import pe.edu.upc.easystore.features.catalog.infrastructure.local.ProductDao
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object CatalogLocalModule {

    @Provides
    @Singleton
    fun provideProductDao(database: AppDatabase): ProductDao {
        return database.productDao()
    }
}