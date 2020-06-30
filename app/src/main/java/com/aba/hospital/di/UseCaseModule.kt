package com.aba.hospital.di

import androidx.annotation.NonNull
import com.aba.core.network.error.ErrorContainer
import com.aba.core.rx.SchedulerProvider
import com.aba.hospital.di.scope.PerApplication
import com.aba.hospital.domain.repository.FilterRepository
import com.aba.hospital.domain.usecase.FilterUseCase
import dagger.Module
import dagger.Provides


@Module
class UseCaseModule  {

    @Provides
    @PerApplication
    fun provideSearchUseCase(
        @NonNull filterRepository: FilterRepository,
        @NonNull schedulerProvider: SchedulerProvider,
        @NonNull errorContainer: ErrorContainer
    ) : FilterUseCase =
        FilterUseCase(
            filterRepository,
            schedulerProvider,
            errorContainer
        )


}