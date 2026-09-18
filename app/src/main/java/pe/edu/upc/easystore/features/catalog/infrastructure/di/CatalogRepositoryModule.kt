package pe.edu.upc.easystore.features.catalog.infrastructure.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import pe.edu.upc.easystore.features.catalog.domain.ProductRepository
import pe.edu.upc.easystore.features.catalog.infrastructure.repositories.ProductRepositoryImpl

@Module
@InstallIn(SingletonComponent::class)
interface CatalogRepositoryModule {

    @Binds
    fun provideProductRepository(impl: ProductRepositoryImpl): ProductRepository

}