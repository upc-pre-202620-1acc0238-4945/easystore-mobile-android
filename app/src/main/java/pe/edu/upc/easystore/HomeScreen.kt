package pe.edu.upc.easystore

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import pe.edu.upc.easystore.ui.theme.EasyStoreTheme

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {

    val products = listOf(
        Product(
            id = 1,
            name = "Product 1",
            description = "Description 1",
            price = 10.0,
            rating = 4.5,
            imageUrl = "https://cdn.dummyjson.com/product-images/beauty/essence-mascara-lash-princess/thumbnail.webp"
        ),
        Product(
            id = 2,
            name = "Product 2",
            description = "Description 2",
            price = 20.0,
            rating = 4.0,
            imageUrl = "https://cdn.dummyjson.com/product-images/beauty/eyeshadow-palette-with-mirror/thumbnail.webp"
        )
    )
    LazyColumn(modifier = modifier.fillMaxSize()) {
        item {
            Text(text = "Home Screen")
        }

        items(count = 5) { index ->
            Text(text = "Item $index")
        }

        items(products) { product ->
            Card(modifier = Modifier
                .fillMaxWidth(0.5f)
                .padding(8.dp)) {
                Column(modifier = Modifier.padding(8.dp)) {

                    AsyncImage(
                        model = product.imageUrl,
                        contentDescription = product.name,
                        modifier = Modifier.fillMaxWidth()
                    )
                    Text(text = product.name, fontWeight = FontWeight.Bold)
                    Text(text = "Rating: ${product.rating}")
                    Text(text = "$${product.price}")
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    EasyStoreTheme(dynamicColor = false) {
        HomeScreen()

    }
}