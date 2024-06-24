package com.example.superheroes_app_rc.data

import com.google.gson.annotations.SerializedName

data class SuperheroListResponse (
    @SerializedName("response") val response: String,
    @SerializedName("results-for") val resultsFor: String,
    @SerializedName("results") val results: List<SuperheroResponse>
){

}