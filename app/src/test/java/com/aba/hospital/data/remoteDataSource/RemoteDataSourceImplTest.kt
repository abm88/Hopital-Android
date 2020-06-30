package com.aba.hospital.data.remoteDataSource

import com.aba.hospital.data.mapper.HospitalDomainMapper
import com.aba.hospital.data.network.NetworkService
import com.aba.hospital.domain.model.HospitalDomainModel
import com.aba.hospital.domain.util.SOME_DOMAIN_MODELS
import com.aba.hospital.domain.util.SOME_RESPONSE_BODY
import com.aba.hospital.domain.util.SOME_TEXT
import com.nhaarman.mockitokotlin2.any
import com.nhaarman.mockitokotlin2.given
import com.nhaarman.mockitokotlin2.verify
import io.reactivex.Observable
import io.reactivex.observers.TestObserver
import okhttp3.ResponseBody
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner


@RunWith(MockitoJUnitRunner::class)
class RemoteDataSourceImplTest {


    @Mock
    private lateinit var mockService: NetworkService
    @Mock
    private lateinit var mockResponseBody: ResponseBody
    @Mock
    private lateinit var mockMapper: HospitalDomainMapper
    @InjectMocks
    private lateinit var subject: RemoteDataSourceImpl

    private lateinit var result: TestObserver<List<HospitalDomainModel>>
    private var someException = Exception(SOME_TEXT)

    @Before
    fun setup(){
        given(mockMapper.map(any())).willReturn(
            SOME_DOMAIN_MODELS
        )

        given(mockResponseBody.string()).willReturn(
            SOME_RESPONSE_BODY
        )
    }

    @Test
    fun `givenResponseIsSuccessful whenOnSearch thenResultIsSuccessful`(){
        givenResponseIsSuccessful()
        whenOnSearch()
        thenResultIsSuccessful()
        thenMockServiceIsCalled()
    }

    @Test
    fun `givenResponseIsFailure whenOnSearch thenRequestNotCompleted`(){
        givenResponseIsFailure()
        whenOnSearch()
        thenRequestNotCompleted()
        thenMockServiceIsCalled()
    }



    /*
     * Given
     */
    private fun givenResponseIsSuccessful() {
        given(mockService.getHospitalData()).willReturn(
            Observable.just(mockResponseBody)
        )
    }

    private fun givenResponseIsFailure() {
        given(mockService.getHospitalData()).willReturn(
            Observable.error(someException)
        )
    }

    /*
     * When
     */

    private fun whenOnSearch() {
        result = subject.getHospitalData("").test()
    }

    /*
     * Then
     */

    private fun thenResultIsSuccessful() = with(result){
        assertComplete()
            .assertNoErrors()
            .assertValue(SOME_DOMAIN_MODELS)
    }

    private fun thenRequestNotCompleted() = with(result){
        assertNotComplete()
            .assertError(someException)
            .assertErrorMessage(SOME_TEXT)
    }

    private fun thenMockServiceIsCalled() {
        verify(mockService).getHospitalData()
    }

}