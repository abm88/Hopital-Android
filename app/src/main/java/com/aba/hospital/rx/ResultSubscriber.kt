package com.aba.hospital.rx

import android.util.Log
import androidx.lifecycle.MutableLiveData
import io.reactivex.observers.DisposableObserver

class ResultSubscriber<T>(
    private val liveData: MutableLiveData<T>,
    private val initBlock: (liveData: MutableLiveData<T>) -> Unit
): DisposableObserver<T>() {

    override fun onStart() {
        super.onStart()
        initBlock(liveData)
    }

    override fun onError(e: Throwable) {
        // No error expected as the error handling is implemented in the use case class
        Log.e("error", "Some error happened $e")
    }

    override fun onNext(t: T) {
        liveData.postValue(t)
    }

    override fun onComplete() {
        // Do Nothing
    }
}