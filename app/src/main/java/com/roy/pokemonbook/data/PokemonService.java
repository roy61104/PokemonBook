package com.roy.pokemonbook.data;

import com.roy.pokemonbook.data.entity.ListResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PokemonService {

    @GET("pokemon")
    Call<ListResponse> getPokemonList(@Query("limit")String limit, @Query("offset")String offset);

}
