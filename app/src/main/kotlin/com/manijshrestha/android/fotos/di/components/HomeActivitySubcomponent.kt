package com.manijshrestha.android.fotos.di.components

import com.manijshrestha.android.fotos.ui.home.HomeActivity
import dagger.Subcomponent
import dagger.android.AndroidInjector

@Subcomponent interface HomeActivitySubcomponent : AndroidInjector<HomeActivity> {

    @Subcomponent.Builder abstract class Builder : AndroidInjector.Builder<HomeActivity>()
}
