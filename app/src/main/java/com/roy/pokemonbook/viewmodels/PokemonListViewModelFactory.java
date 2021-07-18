package com.roy.pokemonbook.viewmodels;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.savedstate.SavedStateRegistryOwner;

import org.jetbrains.annotations.NotNull;

public class PokemonListViewModelFactory extends AbstractSavedStateViewModelFactory {

    /**
     * Constructs this factory.
     *
     * @param owner       {@link SavedStateRegistryOwner} that will provide restored state for created
     *                    {@link ViewModel ViewModels}
     * @param defaultArgs values from this {@code Bundle} will be used as defaults by
     *                    {@link SavedStateHandle} passed in {@link ViewModel ViewModels}
     *                    if there is no previously saved state
     */
    public PokemonListViewModelFactory(@NonNull @NotNull SavedStateRegistryOwner owner, @Nullable @org.jetbrains.annotations.Nullable Bundle defaultArgs) {
        super(owner, defaultArgs);
    }

    @NonNull
    @NotNull
    @Override
    protected <T extends ViewModel> T create(@NonNull @NotNull String key, @NonNull @NotNull Class<T> modelClass, @NonNull @NotNull SavedStateHandle handle) {
        return null;
    }
}
