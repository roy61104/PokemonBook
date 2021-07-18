package com.roy.pokemonbook;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.roy.pokemonbook.db.Pokemon;
import com.roy.pokemonbook.db.PokemonDao;

@Database(entities = {Pokemon.class}, version = 1)
public abstract class AppDataBase extends RoomDatabase {

    public abstract PokemonDao pokemonDao();
}
