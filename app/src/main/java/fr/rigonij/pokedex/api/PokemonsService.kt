package fr.rigonij.pokedex.api

import fr.rigonij.pokedex.api.model.PokemonApiResult
import fr.rigonij.pokedex.api.model.PokemonsApiResult
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokemonsService {
    @GET("pokemon")
    fun listPokemons(@Query("limit") limit: Int): Call<PokemonApiResult>

    @GET("pokemon/{number}")
    fun getPokemons(@Path("number") number: Int): Call<PokemonsApiResult>
}