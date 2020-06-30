package com.aba.hospital

import com.aba.hospital.di.AppComponent
import com.aba.hospital.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class MainApp: DaggerApplication(){

    private val appComponent: AppComponent by lazy {
        DaggerAppComponent.builder()
            .application(this)
            .build()
    }


    override fun applicationInjector(): AndroidInjector<out DaggerApplication> = appComponent

}