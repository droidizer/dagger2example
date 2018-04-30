package com.android.app.dagger2example.di

import android.content.Context
import com.android.app.dagger2example.Dagger2ExampleApplication
import dagger.Module
import dagger.Provides

@Module
class HelperModule {

    @Provides
    fun providesContext(application: Dagger2ExampleApplication): Context = application.applicationContext

    @Provides
    fun providesResources(context: Context) = context.resources
}
