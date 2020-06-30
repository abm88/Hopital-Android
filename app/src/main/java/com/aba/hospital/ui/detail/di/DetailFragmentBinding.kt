package com.aba.hospital.ui.detail.di

import com.aba.hospital.di.scope.PerFragment
import com.aba.hospital.ui.detail.ui.DetailFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class DetailFragmentBinding {

    @PerFragment
    @ContributesAndroidInjector()
    abstract fun contributeSearchFragment(): DetailFragment
}
