package com.manijshrestha.android.fotos.di

import com.manijshrestha.android.fotos.FotosApplication
import dagger.Component

@Component(modules = arrayOf(
        AndroidModule::class,
        VariantModule::class))
interface FotosAppComponent {

    fun inject(app: FotosApplication)
}