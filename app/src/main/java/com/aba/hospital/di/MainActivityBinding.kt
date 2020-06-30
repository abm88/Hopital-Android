package com.aba.hospital.di

import com.aba.hospital.NavigationActivity
import com.aba.hospital.di.scope.PerActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainActivityBinding {

    @PerActivity
    @ContributesAndroidInjector()
    abstract fun contributeMainActivity(): NavigationActivity
}
