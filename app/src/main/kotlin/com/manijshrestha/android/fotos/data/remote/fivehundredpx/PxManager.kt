package com.manijshrestha.android.fotos.data.remote.fivehundredpx

import com.manijshrestha.android.fotos.data.model.PhotoInfo
import io.reactivex.Single

interface PxManager {

    fun getPhotos(): Single<List<PhotoInfo>>

}