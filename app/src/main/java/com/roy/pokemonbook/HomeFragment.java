package com.roy.pokemonbook;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.roy.pokemonbook.adapter.PokemonListAdapter;
import com.roy.pokemonbook.data.entity.ListResponse;
import com.roy.pokemonbook.databinding.FragmentHomeBinding;
import com.roy.pokemonbook.net.NetModule;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding homeBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        homeBinding = DataBindingUtil.inflate(getLayoutInflater(), R.layout.fragment_home, container, false);
        return homeBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Call<ListResponse> pokemonList = NetModule.providePokemonService(
                NetModule.getRetrofit(NetModule.getOkHttpClient())
        ).getPokemonList("386", "0");
        pokemonList.enqueue(new Callback<ListResponse>() {
            @Override
            public void onResponse(Call<ListResponse> call, Response<ListResponse> response) {
                Log.e("zsf","response:"+response);
                homeBinding.rv.setAdapter(new PokemonListAdapter(getActivity(), response.body()));
            }

            @Override
            public void onFailure(Call<ListResponse> call, Throwable t) {
                Log.e("zsf", "throwable:" + t);
            }
        });
    }
}
