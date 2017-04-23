package com.manijshrestha.android.fotos.di.components

import com.manijshrestha.android.fotos.FotosApplication
import com.manijshrestha.android.fotos.di.VariantModule
import com.manijshrestha.android.fotos.di.modules.*
import dagger.Component
import dagger.android.AndroidInjectionModule

@Component(modules = arrayOf(
        AndroidModule::class,
        VariantModule::class,
        NetworkModule::class,
        FiveHunderedPxModule::class,
        AndroidInjectionModule::class,
        HomeActivityModule::class))
interface FotosAppComponent {

    fun inject(app: FotosApplication)
}