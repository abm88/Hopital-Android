package com.aba.hospital.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.aba.core.factory.AppViewModelFactory
import com.aba.hospital.di.util.ViewModelKey
import com.aba.hospital.ui.list.HospitalListViewModel

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelFactoryModule {

    @Binds
    @IntoMap
    @ViewModelKey(HospitalListViewModel::class)
    abstract fun bindListingViewModel(viewModel: HospitalListViewModel): ViewModel


    @Binds
    internal abstract fun bindViewModelFactory(factory : AppViewModelFactory) : ViewModelProvider.Factory

}
