package com.manijshrestha.android.fotos.ui.home

import android.support.annotation.StringRes
import com.manijshrestha.android.fotos.data.model.PhotoInfo

interface HomePresentation {

    fun showPhotos(photos: List<PhotoInfo>)

    fun showError(@StringRes message: Int)

}