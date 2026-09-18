package pe.edu.upc.easystore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import dagger.hilt.android.AndroidEntryPoint
import pe.edu.upc.easystore.core.desingsystem.theme.EasyStoreTheme
import pe.edu.upc.easystore.features.catalog.presentation.home.HomeScreen

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EasyStoreTheme (dynamicColor = false) {
                HomeScreen()
            }
        }
    }
}
