package com.manijshrestha.android.fotos

import android.app.Application
import com.manijshrestha.android.fotos.di.AndroidModule
import com.manijshrestha.android.fotos.di.DaggerFotosAppComponent
import com.manijshrestha.android.fotos.di.FotosAppComponent
import timber.log.Timber
import javax.inject.Inject

class FotosApplication : Application() {

    lateinit var appComponent: FotosAppComponent

    @Inject lateinit var timberTree: Timber.Tree

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerFotosAppComponent.builder().androidModule(AndroidModule(this)).build()
        appComponent.inject(this)

        Timber.plant(timberTree)
    }
}
