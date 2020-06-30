package com.aba.hospital.domain.repository

import com.aba.core.base.BaseRepository
import com.aba.hospital.domain.model.HospitalDomainModel
import com.aba.hospital.network.ResultResponse
import io.reactivex.Observable

interface FilterRepository: BaseRepository {

    fun getHospitalData(query: String): Observable<ResultResponse<List<HospitalDomainModel>>>
}