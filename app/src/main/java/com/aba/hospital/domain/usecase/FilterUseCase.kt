package com.aba.hospital.domain.usecase

import com.aba.core.network.error.ErrorContainer
import com.aba.core.rx.SchedulerProvider
import com.aba.hospital.base.BaseUseCase
import com.aba.hospital.base.ObservableUseCase
import com.aba.hospital.domain.model.HospitalDomainModel
import com.aba.hospital.domain.repository.FilterRepository
import com.aba.hospital.domain.usecase.FilterUseCase.FilterParam
import com.aba.hospital.network.ResultResponse
import io.reactivex.Observable
import javax.inject.Inject

class FilterUseCase @Inject constructor(
    private val repository: FilterRepository,
    scheduler: SchedulerProvider,
    errorContainer: ErrorContainer
) : ObservableUseCase<FilterParam, List<HospitalDomainModel>>(
    scheduler, errorContainer
) {


    override fun buildObservable(params: FilterParam): Observable<ResultResponse<List<HospitalDomainModel>>> {
        return repository.getHospitalData(params.query)
    }

    fun with(query: String) = FilterParam(query)
    data class FilterParam(val query: String) : BaseUseCase.Params
}