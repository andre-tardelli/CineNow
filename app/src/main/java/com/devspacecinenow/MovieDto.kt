package com.devspacecinenow

import com.google.gson.annotations.SerializedName

data class MovieDto (
    val id: Int,
    val title: String,
    val overview: String,
    @SerializedName("porter_path")
    val postPath: String,
)