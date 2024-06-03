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
        featureData("Arts&\nDrawing","$150", R.drawable.artsanddrwaing1),
        featureData("Math&\nPuzzle","$150", R.drawable.mathpazzle1),
        featureData("Science&\nExperiment","$120", R.drawable.science2),
        featureData("Programing&\nDrawing","$350", R.drawable.mathpazzle1),
        featureData("Competitive&\nDrawing","$220", R.drawable.mathpazzle1),
        featureData("Arts&\nlearn","$100", R.drawable.artsanddrwaing1),
        featureData("Arts&\nDrawing","$120", R.drawable.artsanddrwaing1),
        featureData("Arts&\nDrawing","$150", R.drawable.mathpazzle1),


    )
}
