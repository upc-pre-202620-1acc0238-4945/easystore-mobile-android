package pe.edu.upc.easystore.features.catalog.presentation.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import pe.edu.upc.easystore.features.catalog.presentation.home.HomeScreen
import pe.edu.upc.easystore.features.catalog.presentation.productdetail.ProductDetailScreen


fun NavGraphBuilder.catalogNavGraph(navController: NavController) {


    composable("home") {
        HomeScreen()
    }

    composable("product_detail") {

    }
}