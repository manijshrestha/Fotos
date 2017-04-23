package com.manijshrestha.android.fotos.data.remote.fivehundredpx.api.response

internal data class PhotoDetailsResponse(
        val id: Long,
        val user_id: Long,
        val name: String,
        val camera: String,
        val image_url: String
)