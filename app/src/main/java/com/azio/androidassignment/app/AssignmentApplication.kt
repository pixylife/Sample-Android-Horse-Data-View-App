package com.azio.androidassignment.app

import android.app.Application
import com.azio.androidassignment.module.appModules
import es.dmoral.toasty.Toasty
import org.koin.standalone.StandAloneContext

class AssignmentApplication : Application() {

    companion object {
        private lateinit var instance: AssignmentApplication
        fun get(): AssignmentApplication = instance
    }

    override fun onCreate() {
        super.onCreate()
        instance = this

        Toasty.Config.getInstance()
            .allowQueue(true) // optional (prevents several Toastys from queuing)
            .apply()

        // Start Koin
        StandAloneContext.startKoin(appModules)

    }
}