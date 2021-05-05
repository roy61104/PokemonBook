package com.roy.pokemonbook.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.roy.pokemonbook.R;
import com.roy.pokemonbook.data.entity.ListResponse;
import com.roy.pokemonbook.databinding.ItemPokemonBinding;

public class PokemonListAdapter extends RecyclerView.Adapter<PokemonListAdapter.MyHolder> {

    private ListResponse listResponse;
    private Context context;
    private ItemPokemonBinding itemPokemonBinding;

    public PokemonListAdapter(Context context, ListResponse response) {
        this.context = context;
        this.listResponse = response;
    }

    @NonNull
    @Override
    public PokemonListAdapter.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        itemPokemonBinding = DataBindingUtil.inflate(LayoutInflater.from(context),
                R.layout.item_pokemon, parent, false);
        return new MyHolder(itemPokemonBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull PokemonListAdapter.MyHolder holder, int position) {
        holder.itemPokemonBinding.setPokemon(listResponse.getResults().get(position));
        Log.e("zsf","position:"+position);
    }

    @Override
    public int getItemCount() {
        return listResponse.getResults().size();
    }

    class MyHolder extends RecyclerView.ViewHolder {
        ItemPokemonBinding itemPokemonBinding;

        public MyHolder(@NonNull ItemPokemonBinding pokemonBinding) {
            super(pokemonBinding.getRoot());
            this.itemPokemonBinding = pokemonBinding;

        }
    }


}
