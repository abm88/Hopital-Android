package com.aba.hospital.ui.detail.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.aba.hospital.base.BaseFragment
import com.aba.hospital.domain.model.HospitalDomainModel
import com.aba.hospital.navigation.NavigationKeys
import com.aba.testaba.R
import kotlinx.android.synthetic.main.fragment_detail.*

class DetailFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        arguments?.apply {
            getParcelable<HospitalDomainModel>(NavigationKeys.DETAIL_KEY)?.let {
                titleTv.text = it.organisationName
                subTitleTv.text = it.organisationCode
                sectorTv.text = it.sector
                addressTv.text = it.address1
                phoneTv.text = it.phone
            }
        }
    }

}