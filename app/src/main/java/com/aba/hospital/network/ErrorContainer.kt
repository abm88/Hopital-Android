package com.aba.core.network.error

import com.aba.hospital.network.ErrorEntity

interface ErrorContainer {
    fun getError(throwable: Throwable): ErrorEntity
}