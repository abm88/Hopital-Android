package com.aba.hospital.data.remoteDataSource

import com.aba.hospital.base.Mapper
import com.aba.hospital.data.network.NetworkService
import com.aba.hospital.domain.model.HospitalDomainModel
import io.reactivex.Observable
import javax.inject.Inject

class RemoteDataSourceImpl @Inject constructor(
    private val service: NetworkService,
    private val mapper: Mapper<String, List<HospitalDomainModel>>
) : RemoteDataSource {
    override fun getHospitalData(query: String): Observable<List<HospitalDomainModel>> =
        service.getHospitalData().map {
            mapper.map(it.string()).filter {item ->
                item.contains(query)
            }
        }
}