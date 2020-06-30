package com.aba.hospital.data.repository

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.aba.core.rx.SchedulerProvider
import com.aba.hospital.data.remoteDataSource.RemoteDataSource
import com.aba.hospital.domain.model.HospitalDomainModel
import com.aba.hospital.domain.util.SOME_DOMAIN_MODELS
import com.aba.hospital.domain.util.SOME_TEXT
import com.aba.hospital.network.ResultResponse
import com.nhaarman.mockitokotlin2.given
import io.reactivex.Observable
import io.reactivex.observers.TestObserver
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner
import org.mockito.junit.MockitoRule
import java.lang.Exception

@RunWith(MockitoJUnitRunner::class)
class FilterRepositoryImplTest {

    private lateinit var result: TestObserver<ResultResponse<List<HospitalDomainModel>>>
    private val someException = Exception()

    @Mock
    private lateinit var mockRemoteDataSource: RemoteDataSource
    private lateinit var subject: FilterRepositoryImpl

    private lateinit var schedulerProvider: SchedulerProvider


    @Rule
    lateinit var rule: InstantTaskExecutorRule

    @Rule
    lateinit var mockitoRule: MockitoRule

    @Before
    fun setup() {
        subject = FilterRepositoryImpl(
            mockRemoteDataSource
        )
    }


    @Test
    fun `givenRemoteResponseSuccessful whenOnSearch thenResultIsSuccessful`() {
        givenRemoteResponseSuccessful()
        whenOnSearch()
        thenResultIsSuccessful()
    }

    @Test
    fun `givenRemoteResponseIsFailure whenOnSearch thenErrorResult`() {
        givenRemoteResponseIsFailure()
        whenOnSearch()
        thenErrorResult()
    }

    @Test
    fun `givenRemoteResponseIsEmpty whenOnSearch thenEmptySuccessResult`() {
        givenRemoteResponseIsEmpty()
        whenOnSearch()
        thenEmptySuccessResult()
    }


    /*
     * Given
     */


    private fun givenRemoteResponseSuccessful() {
        given(mockRemoteDataSource.getHospitalData(SOME_TEXT)).willReturn(
            Observable.just(SOME_DOMAIN_MODELS)
        )
    }

    private fun givenRemoteResponseIsEmpty() {
        given(mockRemoteDataSource.getHospitalData(SOME_TEXT)).willReturn(
            Observable.just(listOf())
        )
    }


    private fun givenRemoteResponseIsFailure() {
        given(mockRemoteDataSource.getHospitalData(SOME_TEXT)).willReturn(
            Observable.error(someException)
        )
    }



    /*
     * When
     */
    private fun whenOnSearch() {
        result = subject.getHospitalData(SOME_TEXT).test()

    }


    /*
     * Then
     */
    private fun thenResultIsSuccessful() {
        result
            .assertNoErrors()
            .assertComplete()
            .assertValues(
                ResultResponse.Success(SOME_DOMAIN_MODELS)
            )
    }

    private fun thenErrorResult() {
        result
            .assertNotComplete()
            .assertValues()
    }

    private fun thenEmptySuccessResult() {
        result
            .assertComplete()
            .assertNoErrors()
            .assertValues(ResultResponse.Success(listOf()))
    }


}