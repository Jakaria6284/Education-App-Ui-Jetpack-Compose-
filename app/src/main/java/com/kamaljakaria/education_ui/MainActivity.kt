package com.kamaljakaria.education_ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.movableContentOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.kamaljakaria.education_ui.Data.featureData
import com.kamaljakaria.education_ui.Screen.HomePage
import com.kamaljakaria.education_ui.Screen.MyApp
import com.kamaljakaria.education_ui.ui.theme.Education_UITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Education_UITheme {
                // A Box container covering the entire screen with a white background
               Surface(
                   modifier = Modifier.fillMaxSize(),
                   color = Color(0xFCE4D5D2)
               ) {
                  HomePage()



                  }
               }
            }
        }
    }

@Composable
fun imageloader()
{
    Image(
        painter = painterResource(id = R.drawable.maritenisplayer_removebg_preview),
        contentDescription = "Your content description",
        contentScale = ContentScale.Crop
    )
}

@Composable
fun imageloade2r()
{
    Image(
        painter = painterResource(id = R.drawable.maritenisplayer_removebg_preview),
        contentDescription = "Your content description",
       modifier = Modifier.height(130.dp),
       contentScale = ContentScale.Fit,
        alignment = Alignment.Center

    )
}

