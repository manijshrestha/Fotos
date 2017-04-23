package com.manijshrestha.android.fotos.databinding

import android.databinding.BindingAdapter
import android.widget.ImageView
import com.bumptech.glide.Glide

object ImageBindingAdapters {

    @JvmStatic
    @BindingAdapter("imageUrl")
    fun setImageUrl(imageView: ImageView, imageUrl: String) {
        Glide.with(imageView.context)
                .load(imageUrl)
                .into(imageView)
    }

}