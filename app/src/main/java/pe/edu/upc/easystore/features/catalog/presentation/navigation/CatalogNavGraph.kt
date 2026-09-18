package pe.edu.upc.easystore.features.catalog.presentation.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable
import pe.edu.upc.easystore.features.catalog.presentation.home.HomeScreen
import pe.edu.upc.easystore.features.catalog.presentation.productdetail.ProductDetailScreen

@Serializable
object CatalogRoute

@Serializable
data class ProductDetailRoute(val id: Int)

fun NavGraphBuilder.catalogNavGraph(navController: NavController) {


    composable<CatalogRoute> {
        HomeScreen()
    }

    composable<ProductDetailRoute> {

    }
}