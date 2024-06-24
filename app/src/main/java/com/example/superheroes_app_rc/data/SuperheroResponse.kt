package com.example.superheroes_app_rc.data

import com.google.gson.annotations.SerializedName

data class SuperheroResponse (
    @SerializedName("name") val name: String
) {
}