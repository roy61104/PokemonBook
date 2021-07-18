package com.roy.pokemonbook.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.paging.LivePagedListBuilder;
import androidx.paging.PagedList;

import com.roy.pokemonbook.data.entity.ListResponse;

public class PokemonListViewModel extends ViewModel {



    public PokemonListViewModel(LiveData<PagedList<ListResponse.ResultsBean>> pagedListLiveData) {
    }
}
