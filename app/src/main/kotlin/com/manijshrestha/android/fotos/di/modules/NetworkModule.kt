package com.manijshrestha.android.fotos.di.modules

import com.manijshrestha.android.fotos.di.qualifier.OkHttpInterceptor
import dagger.Module
import dagger.Provides
import okhttp3.Interceptor
import okhttp3.OkHttpClient

@Module(includes = arrayOf(
        InterceptorsModule::class))
class NetworkModule {

    @Provides fun providesOkHttpClient(@OkHttpInterceptor interceptors: MutableSet<Interceptor>): OkHttpClient {
        val builder = OkHttpClient.Builder()

        interceptors.forEach { builder.addInterceptor(it) }

        return builder.build()
    }
}