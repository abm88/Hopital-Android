package com.aba.hospital.di

import androidx.annotation.NonNull
import com.aba.hospital.data.network.NetworkService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton


@Module
class ServiceModule {


    @Provides
    @Singleton
    fun provideTVMazeService(@NonNull retrofit: Retrofit): NetworkService =
        retrofit.create(NetworkService::class.java)



}