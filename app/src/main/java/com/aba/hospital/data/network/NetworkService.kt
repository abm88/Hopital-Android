package com.aba.hospital.data.network

import io.reactivex.Observable
import okhttp3.ResponseBody
import retrofit2.http.GET

interface NetworkService {

    @GET("data/foi/Hospital.csv")
    fun getHospitalData(): Observable<ResponseBody>
}