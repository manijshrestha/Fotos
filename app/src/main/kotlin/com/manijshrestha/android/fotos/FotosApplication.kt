package com.manijshrestha.android.fotos

import android.app.Activity
import android.app.Application
import com.manijshrestha.android.fotos.di.components.DaggerFotosAppComponent
import com.manijshrestha.android.fotos.di.components.FotosAppComponent
import com.manijshrestha.android.fotos.di.modules.AndroidModule
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasDispatchingActivityInjector
import timber.log.Timber
import javax.inject.Inject

class FotosApplication : Application(), HasDispatchingActivityInjector {

    @Inject lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    lateinit var appComponent: FotosAppComponent

    @Inject lateinit var timberTree: Timber.Tree

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerFotosAppComponent.builder().androidModule(AndroidModule(this)).build()
        appComponent.inject(this)

        Timber.plant(timberTree)
    }

    override fun activityInjector(): DispatchingAndroidInjector<Activity> = dispatchingAndroidInjector
}
