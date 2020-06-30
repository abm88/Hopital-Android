package com.aba.hospital.ui.list.di

import com.aba.hospital.di.scope.PerFragment
import com.aba.hospital.ui.list.HospitalListFragment
import com.aba.hospital.ui.list.list.FilterItemViewHolder
import com.aba.hospital.ui.list.list.FilterListAdapter
import com.aba.hospital.ui.list.list.FilterListAdapterImpl
import dagger.Module
import dagger.Provides

@Module
class FilterFragmentModule {

    @PerFragment
    @Provides
    fun provideAdapterCallback(searchListFragment: HospitalListFragment):
            FilterListAdapter.FilterAdapterCallback = searchListFragment

    @PerFragment
    @Provides
    fun provideAdapter(adapter: FilterListAdapterImpl):
            FilterListAdapter<FilterItemViewHolder> = adapter

}
