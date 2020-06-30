package com.aba.hospital.di

import androidx.annotation.NonNull
import com.aba.hospital.base.Mapper
import com.aba.hospital.data.mapper.HospitalDomainMapper
import com.aba.hospital.data.remoteDataSource.RemoteDataSource
import com.aba.hospital.data.remoteDataSource.RemoteDataSourceImpl
import com.aba.hospital.data.repository.FilterRepositoryImpl
import com.aba.hospital.domain.model.HospitalDomainModel
import com.aba.hospital.domain.repository.FilterRepository
import dagger.Binds
import dagger.Module
import dagger.Provides


@Module
abstract class DataModule {

    @Module
    companion object {

        @JvmStatic
        @Provides
        fun provideFilterDTOMapper():
                Mapper<String, List<HospitalDomainModel>> = HospitalDomainMapper()
    }

    @Binds
    abstract fun provideFilterRepository(
        @NonNull filterRepo: FilterRepositoryImpl
    ): FilterRepository


    @Binds
    abstract fun provideRemoteFilterDataSource(
        remoteDataSource: RemoteDataSourceImpl
    ): RemoteDataSource


}