package pe.edu.upc.easystore.features.cart.presentation.cart

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle

@Composable
fun CartScreen(modifier: Modifier = Modifier, viewModel: CartViewModel = hiltViewModel()) {

    val state = viewModel.state.collectAsStateWithLifecycle().value

    Column(modifier = modifier.fillMaxSize()) {

        when {
            state.cart.cartItems.isNotEmpty() -> {
                LazyColumn {
                    items(state.cart.cartItems) { cartItem ->
                        Text(text = cartItem.name)
                    }
                }
            }
            state.isLoading -> {
                CircularProgressIndicator()
            }

            state.errorMessage != null -> {
                Text(text = "Error: ${state.errorMessage}")
            }
            else -> {
                Text(text = "Your cart is empty.")
            }
        }
    }

}