package com.manijshrestha.android.fotos.data.remote.fivehundredpx.transformer

import com.manijshrestha.android.fotos.data.model.PhotoInfo
import com.manijshrestha.android.fotos.data.remote.fivehundredpx.api.response.PhotosResponse

internal object PhotosTransformer : Transformer<PhotosResponse, List<PhotoInfo>> {

    override fun transform(source: PhotosResponse): List<PhotoInfo> =
            source.photos.map { PhotoDetailTransformer.transform(it) }

}