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
        Integer nextPageNumber = loadParams.getKey();
        if (nextPageNumber == null) {
            nextPageNumber = 1;
        }

        return null;
    }

    @Nullable
    @Override
    public Integer getRefreshKey(@NotNull PagingState<Integer, ListResponse.ResultsBean> pagingState) {
        // Try to find the page key of the closest page to anchorPosition, from
        // either the prevKey or the nextKey, but you need to handle nullability
        // here:
        //  * prevKey == null -> anchorPage is the first page.
        //  * nextKey == null -> anchorPage is the last page.
        //  * both prevKey and nextKey null -> anchorPage is the initial page, so
        //    just return null.
        Integer anchorPosition = pagingState.getAnchorPosition();
        if (anchorPosition == null) {
            return null;
        }

        LoadResult.Page<Integer, ListResponse.ResultsBean> anchorPage = pagingState.closestPageToPosition(anchorPosition);
        if (anchorPage == null) {
            return null;
        }

        Integer prevKey = anchorPage.getPrevKey();
        if (prevKey != null) {
            return prevKey + 1;
        }

        Integer nextKey = anchorPage.getNextKey();
        if (nextKey != null) {
            return nextKey - 1;
        }

        return null;
    }
}
