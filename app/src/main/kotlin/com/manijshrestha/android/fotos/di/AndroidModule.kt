package com.manijshrestha.android.fotos.di

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class AndroidModule(val context: Application) {

    @Provides
    fun providesContext(): Context = context

}
