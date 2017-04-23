package com.manijshrestha.android.fotos.data.remote.fivehundredpx.transformer

import com.manijshrestha.android.fotos.data.model.PhotoInfo
import com.manijshrestha.android.fotos.data.remote.fivehundredpx.api.response.PhotoDetailsResponse

internal object PhotoDetailTransformer : Transformer<PhotoDetailsResponse, PhotoInfo> {

    override fun transform(source: PhotoDetailsResponse)
            = PhotoInfo(name = source.name, image_url = source.image_url, camera = source.camera)

}