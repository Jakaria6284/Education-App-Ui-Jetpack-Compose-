package com.kamaljakaria.education_ui.Data

data class categoryData(
    val name:String,
)
fun getCategoryData():List<categoryData>
{
    return listOf<categoryData>(
        categoryData("Design"),
        categoryData("illustration"),
        categoryData("Marketing"),
        categoryData("Content"),
        categoryData("Video"),
        categoryData("post"),
        categoryData("Content"),
        categoryData("Video"),
        categoryData("post"),
    )
}
