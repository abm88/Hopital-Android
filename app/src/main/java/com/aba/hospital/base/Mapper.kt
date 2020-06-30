package com.aba.hospital.base

interface Mapper<T, R> {
    fun map(items: T): R
}