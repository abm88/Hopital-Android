package com.aba.hospital.extension

import com.aba.hospital.base.BaseViewModel
import io.reactivex.disposables.Disposable

operator fun<T: BaseViewModel> T.plusAssign(disposable: Disposable) = add(disposable)