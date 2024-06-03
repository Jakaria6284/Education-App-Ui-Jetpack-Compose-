package com.kamaljakaria.education_ui.Screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.MarqueeSpacing
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.*

import androidx.compose.runtime.Composable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kamaljakaria.education_ui.Data.categoryData
import com.kamaljakaria.education_ui.Data.featureData
import com.kamaljakaria.education_ui.Data.getCategoryData
import com.kamaljakaria.education_ui.Data.getallFeatureData
import com.kamaljakaria.education_ui.imageloade2r
import com.kamaljakaria.education_ui.imageloader
import kotlin.random.Random

@Composable
fun HomePage() {
    Column {
        MyApp()
        Moto()
        lazyRoww()
        featureLazy()
        CategoryName()
        CategoryLazy()

    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyApp()
{
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .clip(shape = RoundedCornerShape(bottomStart = 30.dp, bottomEnd = 30.dp))
            .background(
                Color(0xFFF18FB0)

            ),
        verticalArrangement = Arrangement.Top
    )
    {

        Row (
            modifier = Modifier.padding(top = 10.dp, end = 10.dp)
        ){
            Column(
                modifier = Modifier.padding(12.dp)
            ) {
                Text(text = "Good Morning",
                    style = TextStyle(
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White

                    )
                )
                Text(text = "Good Morning",
                    style = TextStyle(
                        fontSize = 25.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = Color.White

                    )
                )

            }
            Spacer(modifier = Modifier.weight(1f))

            IconButton(onClick = { /*TODO*/ },

                modifier = Modifier
                    .size(width = 40.dp, 40.dp)
                    .padding(end = 12.dp)
                    .clip(shape = CircleShape)
                    .background(Color.White)
            ) {
                Icon(Icons.Filled.Face, contentDescription =null, tint = Color.Black )

            }
        }


        OutlinedTextField(
            value = "",
            onValueChange = {

            }
            ,



            label = {
                Text(text = "Search Here.....", fontWeight = FontWeight.Bold)
            },
            placeholder = {
                Text(text = "Enter your Name", fontWeight = FontWeight.Bold)
            },
            leadingIcon = {
                Icon(Icons.Filled.Search, contentDescription = "user profile")
            },

            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
                .padding(20.dp)
            ,
            colors = TextFieldDefaults.colors(
                unfocusedContainerColor = Color.White, // Set the background color to white
                focusedContainerColor = Color.White, // Ensure the background stays white when focused
                unfocusedIndicatorColor = Color.Gray, // Set the border color when unfocused
                focusedIndicatorColor = Color.Blue, // Set the border color when focused
                disabledContainerColor = Color.White, // Optional: Set the background color when disabled
                errorIndicatorColor = Color.Red // Optional: Set the border color in error state
            ),
            shape = RoundedCornerShape(30.dp)
        )






    }
}

@Composable
fun Moto()
{
    Column(
        modifier = Modifier.padding(start = 10.dp, top = 10.dp)
    ) {
        Text(text = "LearnEase",
            style = TextStyle(
                fontSize = 28.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.Black

            )
        )

        Text(text = "Explore,learn,Succeed",
            style = TextStyle(
                fontSize = 24.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.Black

            )
        )
    }
}

@Composable
fun lazyRoww()
{
    val mylist = getCategoryData()
    var selectedIndex by remember { mutableStateOf(0) }

    LazyRow(
        modifier = Modifier.padding(10.dp)
    ) {
        itemsIndexed(mylist) { index, item ->
            val backgroundColor = if (index == selectedIndex) Color(0xFFE28D9C) else Color.Transparent
            LazyRowItem(
                item = item,
                backgroundColor = backgroundColor,
                onClick = {
                    selectedIndex = index
                }
            )
        }
    }
}

@Composable
fun LazyRowItem(item:categoryData,backgroundColor: Color, onClick: () -> Unit)
{

    Button(
        onClick = onClick,
        shape = RoundedCornerShape(25.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = backgroundColor,
            contentColor = Color.Black // Set content color as needed
        ),
        border = BorderStroke(1.dp, Color.Black),
        // Black stroke for button
        modifier = Modifier.padding(8.dp)
    ) {
        Text(text = item.name) // Replace with appropriate item property
    }
}
@Composable
fun featureLazy()
{
    LazyRow {
        val myList= getallFeatureData()
        itemsIndexed(myList, itemContent = {index, item ->
            lazyRowFeatureitem(item = item)

        })
    }
}

@Composable
fun lazyRowFeatureitem(item:featureData)
{
    Box (
        modifier = Modifier

            .padding(start = 10.dp)
    ){
        Box (
            modifier = Modifier
                .clip(shape = RoundedCornerShape(15.dp))
                .size(width = 300.dp, height = 190.dp)
                .background(color = Color(generateRandomLightColor())),
            contentAlignment = Alignment.Center


        ){

            Row (
                modifier = Modifier.padding(start = 10.dp, top = 5.dp),
                verticalAlignment = Alignment.CenterVertically

            ){
                Column(

                ) {
                    Text(text = "${item.name}",
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black

                        )
                    )

                    Text(text = "${item.price}",
                        style = TextStyle(
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.Black

                        )
                    )
                    Spacer(modifier = Modifier.height(40.dp))

                    Button(onClick = { /*TODO*/ },

                        shape = RoundedCornerShape(30.dp),
                        colors = ButtonDefaults.buttonColors(Color(0x8BFFFFFF)),
                        modifier = Modifier.fillMaxWidth(0.6f)
                    ) {
                        Text(text = "12 lesson 28h 40min",
                            style = TextStyle(
                                fontSize = 12.sp,
                                fontWeight = FontWeight.ExtraBold,
                                color = Color.Black

                            )
                        )


                    }
                }

                imageloader(item)
            }
        }
    }

}

fun generateRandomLightColor(): Int {
    val red = Random.nextInt(150, 256) // Random value between 150 and 255 for red (lighter range)
    val green = Random.nextInt(150, 256) // Random value between 150 and 255 for green (lighter range)
    val blue = Random.nextInt(150, 256) // Random value between 150 and 255 for blue (lighter range)
    return android.graphics.Color.rgb(red, green, blue) // Create the color from RGB components
}

@Composable
fun CategoryName()
{
    Row(
        modifier = Modifier.padding(start = 10.dp, top = 5.dp),
        verticalAlignment = Alignment.CenterVertically
    ){
        Text(text = "Explore Category",
            style = TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.Black

            )
        )
        Spacer(modifier = Modifier.weight(1f))

        Text(text = "View All",
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal,
                color = Color.Black

            )
        )
    }
}

@Composable
fun CategoryLazy()
{
    LazyRow {
        val myList= getallFeatureData()
        itemsIndexed(myList, itemContent = {index, item ->
            lazyRowCategoryitem(item = item)

        })
    }
}

@Composable
fun lazyRowCategoryitem(item:featureData)
{
    Box (
        modifier = Modifier

            .padding(start = 10.dp, top = 7.dp)
    ){
        Box (
            modifier = Modifier
                .clip(shape = RoundedCornerShape(15.dp))
                .size(width = 150.dp, height = 190.dp)
                .background(color = Color(generateRandomLightColor())),
            contentAlignment = Alignment.Center


        ){


            Column {
                imageloade2r(item)

                Text(text = "${item.name}",
                    style = TextStyle(
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        textAlign = TextAlign.Center

                    )
                )





            }

        }
    }

}
