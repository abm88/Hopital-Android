package com.aba.hospital.ui.list.di

import com.aba.hospital.di.scope.PerFragment
import com.aba.hospital.ui.list.HospitalListFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class FilterFragmentBinding {
    @PerFragment
    @ContributesAndroidInjector(modules = [FilterFragmentModule::class])
    abstract fun contributeSearchFragment(): HospitalListFragment
}
