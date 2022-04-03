package com.xpro.core.di

import android.app.Activity
import android.content.Context
import androidx.fragment.app.Fragment

val Context.appComponent: AppComponent
    get() =
        (applicationContext as AppComponentProvider).getAppComponent()

val Fragment.appComponent: AppComponent get() = requireContext().appComponent

val Activity.appComponent: AppComponent
    get() =
        (application as AppComponentProvider).getAppComponent()