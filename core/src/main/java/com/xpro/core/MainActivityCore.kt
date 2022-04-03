package com.xpro.core

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.xpro.core.di.appComponent
import com.xpro.core.other.Test
import javax.inject.Inject

class MainActivityCore : AppCompatActivity() {

    @Inject
    lateinit var test: Test

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_core)
        appComponent.inject(this)
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            test.createTest()
        }
    }
}