package com.android.app.dagger2example.di

import com.android.app.dagger2example.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class BuilderModule {

    @ContributesAndroidInjector
    abstract fun mainActivity(): MainActivity
}
