package com.aba.hospital.data.remoteDataSource

import com.aba.core.base.BaseDataSource
import com.aba.hospital.domain.model.HospitalDomainModel
import io.reactivex.Observable

interface RemoteDataSource: BaseDataSource {
    fun getHospitalData(query: String): Observable<List<HospitalDomainModel>>
}