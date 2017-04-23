package com.manijshrestha.android.fotos.ui.home

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.widget.LinearLayoutManager
import com.manijshrestha.android.fotos.R
import com.manijshrestha.android.fotos.data.model.PhotoInfo
import com.manijshrestha.android.fotos.databinding.ActivityHomeBinding
import com.manijshrestha.android.fotos.ui.BaseActivity
import dagger.android.AndroidInjection
import javax.inject.Inject

class HomeActivity : BaseActivity(), HomePresentation {

    @Inject lateinit var presenter: HomePresenter

    var binding: ActivityHomeBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_home)
        binding?.photosRecyclerView?.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        presenter.onCreate(this)
        presenter.initialLoad()
    }

    override fun onDestroy() {
        presenter.onDestroy()
        super.onDestroy()
    }

    //region Presentation Implementation
    override fun showPhotos(photos: List<PhotoInfo>) {
        binding?.adapter = ImageAdapter(photos)
    }

    override fun showError(message: Int) {
        binding?.let {
            Snackbar.make(it.root, message, Snackbar.LENGTH_SHORT).show()
        }
    }
    //endregion
}
