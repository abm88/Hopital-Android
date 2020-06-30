package com.aba.hospital.data.repository

import com.aba.hospital.data.remoteDataSource.RemoteDataSource
import com.aba.hospital.domain.model.HospitalDomainModel
import com.aba.hospital.domain.repository.FilterRepository
import com.aba.hospital.network.ResultResponse
import io.reactivex.Observable
import javax.inject.Inject

class FilterRepositoryImpl @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : FilterRepository {
    override fun getHospitalData(query: String): Observable<ResultResponse<List<HospitalDomainModel>>> =
        remoteDataSource.getHospitalData(query).flatMap {
            Observable.just(
                ResultResponse.Success(it)
            )
        }
}