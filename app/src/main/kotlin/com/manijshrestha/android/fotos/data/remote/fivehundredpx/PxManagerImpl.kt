package com.manijshrestha.android.fotos.data.remote.fivehundredpx

import com.manijshrestha.android.fotos.data.model.PhotoInfo
import com.manijshrestha.android.fotos.data.remote.fivehundredpx.api.PxApi
import com.manijshrestha.android.fotos.data.remote.fivehundredpx.transformer.PhotosTransformer
import io.reactivex.Single

internal class PxManagerImpl(val pxApi: PxApi) : PxManager {

    override fun getPhotos(): Single<List<PhotoInfo>> {
        return pxApi.getPhotos()
                .map { PhotosTransformer.transform(it) }
    }
}