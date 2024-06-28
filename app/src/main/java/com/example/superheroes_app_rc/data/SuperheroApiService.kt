package com.example.superheroes_app_rc.data

import retrofit2.http.GET
import retrofit2.http.Path

interface SuperheroApiService {
    @GET("search/{name}")
    suspend fun findSuperheroesByName(@Path("name") query: String) : SuperheroResponse

    @GET("{character-id}")
    suspend fun getSuperheroById(@Path("character-id") id: Int) : Superhero
}