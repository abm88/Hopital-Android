package com.aba.hospital.base

import com.aba.hospital.base.BaseUseCase.Params
import io.reactivex.Observable

interface BaseUseCase<PARAMS: Params, result> {

    fun execute(params: PARAMS): Observable<result>

    interface Params
}