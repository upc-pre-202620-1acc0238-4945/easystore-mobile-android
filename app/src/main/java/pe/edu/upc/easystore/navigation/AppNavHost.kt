package pe.edu.upc.easystore.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import pe.edu.upc.easystore.features.catalog.presentation.navigation.CatalogRoute
import pe.edu.upc.easystore.features.catalog.presentation.navigation.catalogNavGraph

@Composable
fun AppNavHost(navController: NavHostController) {

    Scaffold(
        bottomBar =  {
            NavigationBar { }
        }
    ){ paddingValues ->
        NavHost(
            navController = navController,
            startDestination = CatalogRoute,
            modifier = Modifier.padding(paddingValues)
        ) {
            catalogNavGraph(navController)
        }
    }


}