package com.manijshrestha.android.fotos.di.modules

import com.manijshrestha.android.fotos.di.qualifier.OkHttpInterceptor
import dagger.Module
import dagger.multibindings.Multibinds
import okhttp3.Interceptor

@Module abstract class InterceptorsModule {

    @Multibinds
    @OkHttpInterceptor
    abstract fun httpInterceptors(): Set<Interceptor>

}