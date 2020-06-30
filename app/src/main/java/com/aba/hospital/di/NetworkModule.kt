package com.aba.hospital.di

import android.content.Context
import androidx.annotation.NonNull

import com.aba.core.network.error.ErrorContainer
import com.aba.hospital.network.GeneralHandlerImpl
import com.aba.hospital.rx.RxErrorHandlingCallAdapterFactory
import com.readystatesoftware.chuck.ChuckInterceptor
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
class NetworkModule {

    @Singleton
    @Provides
    fun provideHttpClient(context: Context): OkHttpClient =
        OkHttpClient.Builder()
            .addInterceptor(ChuckInterceptor(context))
            .cache(null)
            .readTimeout(8, TimeUnit.SECONDS)
            .addInterceptor(HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.BODY
            }).build()

    @Provides
    @Singleton
    fun provideRetrofit(
        @NonNull client: OkHttpClient,
        @NonNull errorContainer: ErrorContainer
    ): Retrofit = Retrofit.Builder()
        .client(client)
        .baseUrl("http://media.nhschoices.nhs.uk/")
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxErrorHandlingCallAdapterFactory.create(errorContainer))
        .build()

    @Singleton
    @Provides
    fun provideErrorHandler(errorHandler: GeneralHandlerImpl): ErrorContainer = errorHandler


}