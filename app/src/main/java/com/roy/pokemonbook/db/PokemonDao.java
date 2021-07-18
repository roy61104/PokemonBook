package com.roy.pokemonbook.db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface PokemonDao {

    @Query("SELECT * FROM pokemon")
    List<Pokemon> getAll();

    @Query("SELECT * FROM pokemon WHERE pid IN (:pokemonIds)")
    List<Pokemon> loadAllByIds(int[] pokemonIds);

    @Query("SELECT * FROM pokemon WHERE name IS :name LIMIT 1")
    Pokemon findByName(String name);

    @Insert
    void insertAll(Pokemon... pokes);

    @Delete
    void delete(Pokemon pokemon);
}
