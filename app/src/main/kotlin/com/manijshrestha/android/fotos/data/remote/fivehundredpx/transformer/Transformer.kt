package com.manijshrestha.android.fotos.data.remote.fivehundredpx.transformer

interface Transformer<in Source, out Result> {

    fun transform(source: Source): Result

}
