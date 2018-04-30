package com.android.app.dagger2example.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.android.app.dagger2example.R
import dagger.android.AndroidInjection

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
