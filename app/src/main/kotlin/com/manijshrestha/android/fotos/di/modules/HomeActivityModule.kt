package com.manijshrestha.android.fotos.di.modules

import android.app.Activity
import com.manijshrestha.android.fotos.di.components.HomeActivitySubcomponent
import com.manijshrestha.android.fotos.ui.HomeActivity
import dagger.Binds
import dagger.Module
import dagger.android.ActivityKey
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap

@Module(subcomponents = arrayOf(HomeActivitySubcomponent::class))
abstract class HomeActivityModule {

    @Binds
    @IntoMap
    @ActivityKey(HomeActivity::class)
    internal abstract fun bindsHomeActivtyInjectorFactory(builder: HomeActivitySubcomponent.Builder): AndroidInjector.Factory<out Activity>
}