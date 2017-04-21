package com.manijshrestha.android.fotos.di

import com.manijshrestha.android.fotos.CrashReportingTree
import dagger.Module
import dagger.Provides
import timber.log.Timber

@Module
class VariantModule {

    @Provides
    fun providesTree(): Timber.Tree = CrashReportingTree()

}