package com.manijshrestha.android.fotos.data.remote.fivehundredpx.interceptor

import okhttp3.Interceptor
import okhttp3.Response

class ConsumerKeyInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        var request = chain.request()
        request = request.newBuilder()
                .url(request.url().newBuilder()
                        .addQueryParameter("consumer_key", "1YyoFmZkeTmyPWvCQrA8EzBXy0E9VVhzDc1z6dOC")
                        .build())
                .build()

        return chain.proceed(request)
    }

}