package fr.rigonij.pokedex.api.model

import fr.rigonij.pokedex.domain.PokemonType

data class PokemonApiResult(
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<PokemonResult>
        )

data class  PokemonResult(
    val name: String,
    val url: String
)

data class PokemonsApiResult(
    val id: Int,
    val name: String,
    val types: List<PokemonTypeSlot>
)

data class PokemonTypeSlot(
    val slot: Int,
    val type: PokemonType
)