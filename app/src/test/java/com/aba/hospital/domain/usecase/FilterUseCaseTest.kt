package com.aba.hospital.domain.usecase

import com.aba.core.network.error.ErrorContainer
import com.aba.core.rx.SchedulerProvider
import com.aba.core.rx.TestSchedulerProvider
import com.aba.core.rx.TrampolineSchedulerProvider
import com.aba.hospital.domain.model.HospitalDomainModel
import com.aba.hospital.domain.repository.FilterRepository
import com.aba.hospital.domain.usecase.FilterUseCase.FilterParam
import com.aba.hospital.domain.util.SOME_DOMAIN_MODELS
import com.aba.hospital.domain.util.SOME_TEXT
import com.aba.hospital.network.ErrorEntity
import com.aba.hospital.network.ResultResponse
import com.nhaarman.mockitokotlin2.any
import com.nhaarman.mockitokotlin2.given
import com.nhaarman.mockitokotlin2.verify
import io.reactivex.Observable
import io.reactivex.observers.TestObserver
import org.assertj.core.api.Assertions.assertThat
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class FilterUseCaseTest {



    private lateinit var param: FilterParam
    private lateinit var result: TestObserver<ResultResponse<List<HospitalDomainModel>>>
    private val searchParam = FilterParam(SOME_TEXT)
    private val stubException = Exception()

    private lateinit var schedulerProvider: SchedulerProvider
    @Mock
    private lateinit var filterRepository: FilterRepository
    @Mock
    private lateinit var errorContainer: ErrorContainer

    private lateinit var subject: FilterUseCase

    @Before
    fun setup() {
        provideImmediateSchedulers()
        MockitoAnnotations.initMocks(this)
        subject = FilterUseCase(
            filterRepository,
            schedulerProvider,
            errorContainer
        )
    }

    @Test
    fun `whenOnSearch givenSuccessfulResponse thenResultIsSuccessful`() {
        givenSuccessfulResponse()
        whenOnSearch()
        thenResultIsSuccessful()
        thenRepositoryIsCalled()
    }

    @Test
    fun `whenOnSearch givenFailureResponse thenResultIsFailure`() {
        givenErrorContainer()
        givenFailureResponse()
        whenOnSearch()
        thenResultIsFailure()
        thenRepositoryIsCalled()
    }

    @Test
    fun `whenOnWith givenQueryString thenParamIsCreated`(){
        whenOnWith()
        thenParamIsCreated()
    }


    /*
     * Given
     */
    private fun givenSuccessfulResponse() {
        given(filterRepository.getHospitalData(SOME_TEXT)).willReturn(
            Observable.just(ResultResponse.Success(SOME_DOMAIN_MODELS))
        )
    }

    private fun givenFailureResponse() {
        given(filterRepository.getHospitalData(SOME_TEXT)).willReturn(
            Observable.error(stubException)
        )
    }

    private fun givenErrorContainer() {
        given(errorContainer.getError(any())).willReturn(ErrorEntity.Network)
    }


    /*
     * When
     */
    private fun whenOnSearch() {
        result = subject.execute(searchParam).test()
    }

    private fun whenOnWith() {
        param = subject.with(SOME_TEXT)
    }
    /*
     * Then
     */
    private fun thenResultIsSuccessful() = with(result) {
        assertComplete()
            .assertNoErrors()
            .assertValue(ResultResponse.Success(SOME_DOMAIN_MODELS))
    }

    private fun thenRepositoryIsCalled() {
        verify(filterRepository).getHospitalData(SOME_TEXT)
    }

    private fun thenResultIsFailure() = with(result) {
        assertComplete()
            .assertValue(ResultResponse.Failure(ErrorEntity.Network))
    }

    private fun thenParamIsCreated() {
        assertThat(param).isEqualTo(FilterParam(SOME_TEXT))
    }

    /*
     * Helper
     */
    private fun provideImmediateSchedulers() {
        schedulerProvider = TrampolineSchedulerProvider()
    }

    private fun provideTestSchedulers() {
        schedulerProvider = TestSchedulerProvider()
    }

}