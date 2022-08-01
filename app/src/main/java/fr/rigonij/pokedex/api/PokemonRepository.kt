package fr.rigonij.pokedex.api

import android.util.Log
import fr.rigonij.pokedex.api.model.PokemonApiResult
import fr.rigonij.pokedex.api.model.PokemonsApiResult
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object PokemonRepository {
    private val service: PokemonsService

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://pokeapi.co/api/v2/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        service = retrofit.create(PokemonsService::class.java)
    }

    fun listPokemons(limit: Int = 700): PokemonApiResult? {
        val call = service.listPokemons(limit)

        return call.execute().body()
          }

    fun getPokemon(number: Int): PokemonsApiResult? {
        val call = service.getPokemons(number)

        return call.execute().body()
    }
 }