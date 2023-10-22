package com.mariwerty.gigachat

import android.app.Application
import timber.log.Timber


class GigachatApp: Application(){
    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
             Timber.plant(Timber.DebugTree())
        }
    }

}

