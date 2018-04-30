package com.android.app.dagger2example.di

import com.android.app.dagger2example.Dagger2ExampleApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import dagger.android.support.DaggerApplication

@Component(modules = [(AndroidSupportInjectionModule::class), (HelperModule::class), (BuilderModule::class)])
interface Component {

    fun inject(app: Dagger2ExampleApplication)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Dagger2ExampleApplication): Builder

        fun build(): com.android.app.dagger2example.di.Component
    }
}