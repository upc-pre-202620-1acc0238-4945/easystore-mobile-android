package pe.edu.upc.easystore.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import pe.edu.upc.easystore.features.catalog.presentation.navigation.CatalogRoute
import pe.edu.upc.easystore.features.catalog.presentation.navigation.catalogNavGraph

@Composable
fun AppNavHost(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = CatalogRoute
    ) {
        catalogNavGraph(navController)
    }

}