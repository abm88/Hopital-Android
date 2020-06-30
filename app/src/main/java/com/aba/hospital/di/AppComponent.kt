package com.aba.hospital.di

import android.app.Application
import com.aba.hospital.di.scope.PerApplication
import com.aba.hospital.ui.detail.di.DetailFragmentBinding
import com.aba.hospital.ui.list.di.FilterFragmentBinding
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import javax.inject.Singleton

@PerApplication
@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        AndroidModule::class,
        ViewModelFactoryModule::class,
        NetworkModule::class,
        UseCaseModule::class,
        ServiceModule::class,
        DataModule::class,
        RxModule::class,
        MainActivityBinding::class,
        FilterFragmentBinding::class,
        DetailFragmentBinding::class
    ]
)
interface AppComponent : AndroidInjector<DaggerApplication> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    override fun inject(instance: DaggerApplication)
}