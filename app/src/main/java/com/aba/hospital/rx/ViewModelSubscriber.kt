package com.aba.hospital.rx

import androidx.lifecycle.MutableLiveData
import com.aba.core.network.error.ErrorContainer
import com.aba.hospital.network.ResultResponse
import io.reactivex.observers.DisposableSingleObserver

class ViewModelSubscriber<T: ResultResponse<R>, R>(
    private val liveData: MutableLiveData<T>,
    private val errorContainer: ErrorContainer
): DisposableSingleObserver<T>() {
    override fun onSuccess(t: T) {
        liveData.postValue(t)
    }

    override fun onError(e: Throwable) {
        liveData.postValue(ResultResponse.Failure<R>(errorContainer.getError(e)) as T)
    }
}