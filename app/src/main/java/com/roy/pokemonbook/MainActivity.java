package com.roy.pokemonbook;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.roy.pokemonbook.db.Pokemon;

import java.util.ArrayList;
import java.util.List;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppDataBase dataBaseInstance = MyApplication.getDataBaseInstance();
        Pokemon pokemon = new Pokemon();
        pokemon.pid = 1;
        pokemon.name = "超梦";
        pokemon.url = "www.baidu.com";

        new Thread(new Runnable() {
            @Override
            public void run() {
                List<Pokemon> pokes = dataBaseInstance.pokemonDao().getAll();
                for (Pokemon item : pokes) {
                    if (item.pid == pokemon.pid) {
                        return;
                    }
                }
                dataBaseInstance.pokemonDao().insertAll(pokemon);
            }
        }).start();

    }
}