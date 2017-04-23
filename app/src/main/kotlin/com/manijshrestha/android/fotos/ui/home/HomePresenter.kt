package com.manijshrestha.android.fotos.ui.home

import com.manijshrestha.android.fotos.R
import com.manijshrestha.android.fotos.data.remote.fivehundredpx.PxManager
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

class HomePresenter @Inject constructor(val pxManager: PxManager) {

    val compositeDisposable = CompositeDisposable()

    var presentation: HomePresentation? = null

    fun onCreate(presentation: HomePresentation) {
        this.presentation = presentation
    }

    fun initialLoad() {
        val disposable = pxManager.getPhotos()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        { photos -> presentation?.showPhotos(photos) },
                        { _ -> presentation?.showError(R.string.photo_load_error) })

        compositeDisposable.add(disposable)
    }

    fun onDestroy() {
        compositeDisposable.clear()
        presentation = null
    }

}