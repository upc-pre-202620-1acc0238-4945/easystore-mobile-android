package pe.edu.upc.easystore.features.catalog.presentation.productdetail

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import coil3.compose.AsyncImage

@Composable
fun ProductDetailScreen(
    id: Int,
    modifier: Modifier = Modifier,
    viewModel: ProductDetailViewModel = viewModel()
) {

    val uiState = viewModel.uiState.collectAsStateWithLifecycle().value

    LaunchedEffect(id) {
        viewModel.loadProduct(id)
    }
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        when (uiState) {
            is ProductDetailUiState.Loading -> {
                CircularProgressIndicator()
            }

            is ProductDetailUiState.Success -> {
                AsyncImage(
                    model = uiState.product.imageUrl,
                    contentDescription = uiState.product.name
                )
            }

            is ProductDetailUiState.Error -> {
                Text(text = uiState.message)
            }
        }

    }


}