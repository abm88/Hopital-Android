package com.aba.hospital.ui.list

import android.widget.Spinner
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModelProvider
import com.aba.core.base.FragmentTestBase
import com.aba.hospital.domain.model.HospitalDomainModel
import com.aba.hospital.domain.util.SOME_DOMAIN_MODELS
import com.aba.hospital.network.ResultResponse
import com.aba.hospital.ui.list.list.FilterItemViewHolder
import com.aba.hospital.ui.list.list.FilterListAdapter
import com.aba.testaba.R
import com.nhaarman.mockitokotlin2.given
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import kotlinx.android.synthetic.main.fragment_hospital_list.view.*
import org.assertj.core.api.Assertions.assertThat
import org.assertj.android.api.Assertions.assertThat
import org.junit.Before
import org.junit.Test
import org.mockito.MockitoAnnotations.initMocks

class HospitalListFragmentTest : FragmentTestBase<HospitalListFragment>() {

    private val mockViewModelFactory: ViewModelProvider.Factory = mock()
    private val mockViewModel: HospitalListViewModel = mock()
    private val mockAdapter: FilterListAdapter<FilterItemViewHolder> = mock()

    private val filterLiveData = MutableLiveData<ResultResponse<List<HospitalDomainModel>>>()


    private val spinner by lazy {
        fragment.view?.findViewById<Spinner>(R.id.spinner)
    }

    @Before
    fun setup() {
        initMocks(this)
        setupViewModel()
        setupViewModelState()
        createFragment()
    }


    @Test
    fun `whenOnCreate thenViewIsCreated andThenViewModelIsCreated`() {
        thenViewIsCreated()
        thenViewModelIsCreated()
    }


    @Test
    fun `whenOnCreate thenRecyclerInitialized`() {
        thenRecyclerInitialized()
    }


    @Test
    fun `whenOnSubmitClicked thenViewModelFilterCalled`() {
        whenOnSubmitClicked()
        thenViewModelFilterCalled()
    }

    @Test
    fun `givenFilterResultAvailable thenRecyclerViewAdapterIsPopulated`() {
        givenFilterResultAvailable()
        thenRecyclerViewAdapterIsPopulated()
    }


    /*
     Given
     */

    private fun givenFilterResultAvailable() {
        filterLiveData.postValue(
            ResultResponse.Success(SOME_DOMAIN_MODELS)
        )
    }

    /*
     When
     */
    private fun whenOnSubmitClicked() {
        spinner?.setSelection(1)
    }

    /*
     Then
     */
    private fun thenViewModelIsCreated() {
        assertThat(fragment.viewModel).isNotNull
    }

    private fun thenViewIsCreated() = with(fragment.view) {
        assertThat(this).isNotNull
        assertThat(this).isVisible
    }

    private fun thenViewModelFilterCalled() {
        verify(mockViewModel).getFilterResult(fragment.resources.getStringArray(R.array.search_filter_list)[1])
    }

    /*
     Helper
     */

    private fun setupViewModel() {
        given(mockViewModelFactory.create(HospitalListViewModel::class.java)).willReturn(mockViewModel)

    }

    private fun setupViewModelState() {
        given(mockViewModel.filterLiveData).willReturn(
            filterLiveData
        )
    }

    private fun thenRecyclerInitialized() = with(fragment.view?.listRv!!) {
        assertThat(adapter).isEqualTo(mockAdapter)
    }

    private fun thenRecyclerViewAdapterIsPopulated() {
        verify(mockAdapter).filterItems = SOME_DOMAIN_MODELS
    }


}