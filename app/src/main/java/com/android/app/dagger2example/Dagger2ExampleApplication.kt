package com.android.app.dagger2example

import android.app.Activity
import android.app.Application
import com.android.app.dagger2example.di.DaggerComponent
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class Dagger2ExampleApplication : Application(), HasActivityInjector {

    @Inject
    lateinit var mAndroidActivityInjector: DispatchingAndroidInjector<Activity>

    override fun activityInjector(): DispatchingAndroidInjector<Activity> = mAndroidActivityInjector

    override fun onCreate() {
        super.onCreate()
        DaggerComponent.builder()
                .application(this)
                .build()
                .inject(this)
    }
}
