package com.xpro.xpro.app.di

import android.app.Application
import com.xpro.core.di.AppComponent
import com.xpro.core.di.AppScope
import com.xpro.core.di.BaseAppModule
import dagger.Component

@AppScope
@Component(
    modules = [BaseAppModule::class]
)
interface AppComponentImpl : AppComponent

fun createAppComponents(application: Application): AppComponent =
    DaggerAppComponentImpl.builder()
        .baseAppModule(BaseAppModule(application))
        .build()


