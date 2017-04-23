package com.manijshrestha.android.fotos.data.model

import android.os.Parcel
import android.os.Parcelable

data class PhotoInfo(
        val name: String,
        val imageUrl: String,
        val camera: String?
) : Parcelable {
    companion object {
        @JvmField val CREATOR: Parcelable.Creator<PhotoInfo> = object : Parcelable.Creator<PhotoInfo> {
            override fun createFromParcel(source: Parcel): PhotoInfo = PhotoInfo(source)
            override fun newArray(size: Int): Array<PhotoInfo?> = arrayOfNulls(size)
        }
    }

    private constructor(source: Parcel) : this(source.readString(), source.readString(), source.readString())

    override fun describeContents() = 0

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        dest?.writeString(name)
        dest?.writeString(imageUrl)
        dest?.writeString(camera)
    }
}
