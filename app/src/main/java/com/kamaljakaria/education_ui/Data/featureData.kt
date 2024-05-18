package com.kamaljakaria.education_ui.Data

import com.kamaljakaria.education_ui.R

data class featureData(
    val name:String,
    val price:String,
    val image:Int,
)

fun getallFeatureData():List<featureData>
{
    return listOf<featureData>(
        featureData("Arts&\nDrawing","$150", R.drawable.maritenisplayer_removebg_preview),
        featureData("Math&\nPuzzle","$150", R.drawable.maritenisplayer_removebg_preview),
        featureData("Science&\nExperiment","$120", R.drawable.maritenisplayer_removebg_preview),
        featureData("Programing&\nDrawing","$350", R.drawable.maritenisplayer_removebg_preview),
        featureData("Competitive&\nDrawing","$220", R.drawable.maritenisplayer_removebg_preview),
        featureData("Arts&\nlearn","$100", R.drawable.maritenisplayer_removebg_preview),
        featureData("Arts&\nDrawing","$120", R.drawable.maritenisplayer_removebg_preview), featureData("Arts&\nDrawing","$150", R.drawable.maritenisplayer_removebg_preview),


    )
}
