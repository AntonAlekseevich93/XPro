package com.xpro.xpro

import android.app.Application
import android.content.Context
import com.xpro.core.di.AppComponent
import com.xpro.core.di.AppComponentProvider
import com.xpro.xpro.app.di.createAppComponents

abstract class XProApplication : Application(),
    AppComponentProvider {

    private var appComponent: AppComponent? = null

    override fun onCreate() {
        super.onCreate()
        mInstance = this
        getAppComponent()
    }

    override fun getAppComponent(): AppComponent {
        if (appComponent == null) {
            appComponent = createAppComponent()
        }
        return appComponent as AppComponent
    }

    private fun createAppComponent(): AppComponent {
        return createAppComponents(this)
    }


    companion object {
        private var mInstance: XProApplication? = null
        var getInstance: XProApplication? = mInstance
        fun from(context: Context): XProApplication = context.applicationContext as XProApplication
    }
}