package com.manijshrestha.android.fotos.data.remote.fivehundredpx.api

import com.manijshrestha.android.fotos.data.remote.fivehundredpx.api.response.PhotosResponse
import io.reactivex.Single
import retrofit2.http.GET

internal interface PxApi {

    @GET("v1/photos?feature=fresh_today&sort=created_at&image_size=4&include_states=voted")
    fun getPhotos(): Single<PhotosResponse>
}