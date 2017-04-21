package com.manijshrestha.android.fotos.di

import dagger.Module
import dagger.Provides
import timber.log.Timber

@Module
class VariantModule {

    @Provides
    fun providesTree(): Timber.Tree = Timber.DebugTree()
}