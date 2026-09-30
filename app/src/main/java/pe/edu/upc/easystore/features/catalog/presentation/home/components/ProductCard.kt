package pe.edu.upc.easystore.features.catalog.presentation.home.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import pe.edu.upc.easystore.features.catalog.domain.Product

@Composable
fun ProductCard(
    product: Product,
    onProductClick: () -> Unit

) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        onClick = onProductClick
    ) {
        Column(modifier = Modifier.padding(8.dp)) {

            AsyncImage(
                model = product.imageUrl,
                contentDescription = product.name,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
            )
            Text(text = product.name, fontWeight = FontWeight.Bold)
            Text(text = "Rating: ${product.rating}")
            Text(text = "$${product.price}")
        }
    }
}