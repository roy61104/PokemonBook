package com.roy.pokemonbook.binding;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
import com.roy.pokemonbook.R;

public final class ViewBinding {

    //bindingAdapter必须是static的
    @BindingAdapter("bindingImage")
    public static void bindImage(ImageView imageView, String url) {
        Glide.with(imageView.getContext())
                .load(url)
                .placeholder(R.drawable.ic_pokemon_default)
                .into(imageView);
    }
}
