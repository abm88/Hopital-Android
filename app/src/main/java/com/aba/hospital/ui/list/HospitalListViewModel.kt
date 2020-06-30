package com.aba.hospital.ui.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.aba.hospital.base.BaseViewModel
import com.aba.hospital.domain.model.HospitalDomainModel
import com.aba.hospital.domain.usecase.FilterUseCase
import com.aba.hospital.extension.plusAssign
import com.aba.hospital.network.ResultResponse
import com.aba.hospital.rx.ResultSubscriber
import javax.inject.Inject

class HospitalListViewModel @Inject constructor(
    private val interactor: FilterUseCase
): BaseViewModel() {

    val filterLiveData: LiveData<ResultResponse<List<HospitalDomainModel>>>
        get() = _filterLiveData
    private val _filterLiveData= MutableLiveData<ResultResponse<List<HospitalDomainModel>>>()


    fun getFilterResult(query: String) {
        this += interactor.execute(interactor.with(query)).subscribeWith(
            ResultSubscriber(_filterLiveData){
                _filterLiveData.postValue(ResultResponse.Loading())
            }
        )
    }

}