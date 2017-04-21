package com.manijshrestha.android.fotos

import timber.log.Timber

class CrashReportingTree : Timber.Tree() {

    override fun log(priority: Int, tag: String?, message: String?, error: Throwable?) {
        //no-op
    }
}
