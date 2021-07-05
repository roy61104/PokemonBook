package com.roy.pokemonbook.data;

import androidx.paging.ListenableFuturePagingSource;
import androidx.paging.PagingState;

import com.google.common.util.concurrent.ListenableFuture;
import com.roy.pokemonbook.data.entity.ListResponse;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PokemonPagingSource extends ListenableFuturePagingSource<Integer, ListResponse.ResultsBean> {
    @NotNull
    @Override
    public ListenableFuture<LoadResult<Integer, ListResponse.ResultsBean>> loadFuture(@NotNull LoadParams<Integer> loadParams) {
        return null;
    }

    @Nullable
    @Override
    public Integer getRefreshKey(@NotNull PagingState<Integer, ListResponse.ResultsBean> pagingState) {
        return null;
    }
}
