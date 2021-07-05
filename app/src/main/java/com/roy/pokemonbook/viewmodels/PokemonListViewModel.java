package com.roy.pokemonbook.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.paging.LivePagedListBuilder;
import androidx.paging.PagedList;

import com.roy.pokemonbook.data.entity.ListResponse;

public class PokemonListViewModel extends ViewModel {

    public final LiveData<PagedList<ListResponse.ResultsBean>> listLiveData;


    public PokemonListViewModel(LiveData<PagedList<ListResponse.ResultsBean>> pagedListLiveData) {
        listLiveData = new LivePagedListBuilder<>(new PokemonListViewModelFactory(), /* page size */ 50).build();
    }
}
