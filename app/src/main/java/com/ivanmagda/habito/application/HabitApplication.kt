package com.sankalpsikchi.habito.application

import android.app.Application

import com.sankalpsikchi.habito.analytics.HabitoAnalytics
import com.sankalpsikchi.habito.sync.FirebaseSyncUtils

class HabitApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        HabitoAnalytics.initAnalytics(this)
        HabitoAnalytics.logAppOpen()

        FirebaseSyncUtils.setOfflineModeEnabled(true)
    }
}
