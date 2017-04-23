package com.manijshrestha.android.fotos.ui.home

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.manijshrestha.android.fotos.data.model.PhotoInfo
import com.manijshrestha.android.fotos.databinding.ItemPhotoBinding

class ImageAdapter(var photos: List<PhotoInfo>) : RecyclerView.Adapter<ImageItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageItemViewHolder {
        val binding = ItemPhotoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ImageItemViewHolder(binding)
    }

    override fun getItemCount() = photos.size

    override fun onBindViewHolder(holder: ImageItemViewHolder, position: Int) {
        holder.bind(photos[position])
    }

}

class ImageItemViewHolder(val itemBinding: ItemPhotoBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {

    fun bind(photoInfo: PhotoInfo) {
        itemBinding.model = photoInfo
        itemBinding.executePendingBindings()
    }

}