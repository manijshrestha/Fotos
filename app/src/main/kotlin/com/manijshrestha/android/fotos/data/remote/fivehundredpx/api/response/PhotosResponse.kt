package com.manijshrestha.android.fotos.data.remote.fivehundredpx.api.response

internal data class PhotosResponse(
        val current_page: Int,
        val total_pages: Int,
        val total_items: Int,
        val photos: List<PhotoDetailsResponse>
)