package com.xpro.core.di

import com.xpro.core.MainActivityCore
import com.xpro.core.other.Test


interface AppComponent {

    fun inject(mainActivityCore: MainActivityCore)

    val test: Test
}