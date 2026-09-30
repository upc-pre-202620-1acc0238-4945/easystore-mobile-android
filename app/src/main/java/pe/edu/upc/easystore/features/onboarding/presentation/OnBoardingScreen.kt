package pe.edu.upc.easystore.features.onboarding.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pe.edu.upc.easystore.R

@Preview(showBackground = true)
@Composable
fun OnBoardingScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Cyan.copy(alpha = 0.25f))
    ) {
        Text(
            text = "Playful",
            color = Color.White,
            modifier = Modifier
                .align(Alignment.TopEnd)
                .offset(x = 64.dp, y = 104.dp)
                .rotate(90f),
            fontSize = 64.sp,
            fontWeight = FontWeight.Bold
        )
        Image(
            painter = painterResource(R.drawable.background),
            contentDescription = "background",
            modifier = Modifier.fillMaxSize(1f),
            contentScale = ContentScale.Crop
        )

        InformationCard(
            title = "Find Your Outfits",
            subTitle = "Confused about your outfit?",
            textButton = "Let's get started",
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.35f)
                .align(Alignment.BottomCenter)
        )
    }


}