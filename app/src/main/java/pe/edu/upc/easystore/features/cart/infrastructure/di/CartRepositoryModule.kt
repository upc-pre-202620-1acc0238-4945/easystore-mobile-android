package pe.edu.upc.easystore.features.cart.infrastructure.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import pe.edu.upc.easystore.features.cart.domain.CartRepository
import pe.edu.upc.easystore.features.cart.infrastructure.repositories.CartRepositoryImpl


@Module
@InstallIn(SingletonComponent::class)
interface CartRepositoryModule {

    @Binds
    fun provideCartRepository(impl: CartRepositoryImpl): CartRepository
}