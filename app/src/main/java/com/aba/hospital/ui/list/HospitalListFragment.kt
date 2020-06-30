package com.aba.hospital.ui.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.recyclerview.widget.LinearLayoutManager
import com.aba.hospital.base.BaseFragment
import com.aba.hospital.domain.model.HospitalDomainModel
import com.aba.hospital.extension.*
import com.aba.hospital.navigation.NavigationKeys
import com.aba.hospital.network.ResultResponse
import com.aba.hospital.ui.list.list.FilterListAdapter
import com.aba.hospital.ui.list.list.FilterItemViewHolder
import com.aba.testaba.R
import kotlinx.android.synthetic.main.fragment_hospital_list.*
import javax.inject.Inject

class HospitalListFragment : BaseFragment(), FilterListAdapter.FilterAdapterCallback,
    AdapterView.OnItemSelectedListener {

    private var lastSelectedSpinnerPosition = -1

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    @Inject
    lateinit var adapter: FilterListAdapter<FilterItemViewHolder>


    val viewModel by lazy {
        viewModelFactory.create(HospitalListViewModel::class.java)
    }

    override fun onFilterItem(item: HospitalDomainModel, view: View) {
        getNavigatorActivity().navigateToDetail(
            Bundle().apply {
                putParcelable(NavigationKeys.DETAIL_KEY, item)
            },
            FragmentNavigatorExtras()
        )
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {

    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        if (lastSelectedSpinnerPosition != position){
            viewModel.getFilterResult(resources.getStringArray(R.array.search_filter_list)[position])
            lastSelectedSpinnerPosition = position
        }
        hideSoftKeybaord()
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_hospital_list, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        initObserver()
        initListeners()
    }


    private fun initView() {
        listRv.layoutManager = LinearLayoutManager(context)
        listRv.adapter = adapter

    }


    private fun initListeners() {
        spinner.adapter = ArrayAdapter<String>(
            requireContext(),
            android.R.layout.simple_spinner_dropdown_item,
            resources.getStringArray(R.array.filter_list)
        )
        spinner.onItemSelectedListener = this
    }

    private fun initObserver() {
        observeLiveData(viewModel.filterLiveData) {
            when (it) {
                is ResultResponse.Success<*> -> {
                    processSuccessResult(it)
                }
                is ResultResponse.Failure<*> -> {
                    loadingView.hide()
                    emptyView.hide()
                    toastIt(it.error.toString())
                }
                is ResultResponse.Loading<*> -> {
                    loadingView.show()
                    emptyView.hide()
                }
            }
        }
    }

    private fun processSuccessResult(it: ResultResponse<List<HospitalDomainModel>>) {
        loadingView.hide()
        (it as ResultResponse.Success<List<HospitalDomainModel>>).data.also { items ->
            adapter.filterItems = items
            if (items.isNullOrEmpty())
                emptyView.show()
            else {
                emptyView.hide()
            }
        }
    }


}