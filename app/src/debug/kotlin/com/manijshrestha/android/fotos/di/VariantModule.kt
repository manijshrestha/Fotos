package com.manijshrestha.android.fotos.di

import com.manijshrestha.android.fotos.di.qualifier.OkHttpInterceptor
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoSet
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import timber.log.Timber

@Module
class VariantModule {

    @Provides
    fun providesTree(): Timber.Tree = Timber.DebugTree()

    @Provides
    @OkHttpInterceptor
    @IntoSet
    fun providesLoggingInteceptor(): Interceptor =
            HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BODY }
}