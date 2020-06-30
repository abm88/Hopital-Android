package com.aba.hospital.ui.list.list

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.aba.hospital.domain.model.HospitalDomainModel

abstract class FilterListAdapter<VH: RecyclerView.ViewHolder>: RecyclerView.Adapter<VH>() {

    var filterItems: List<HospitalDomainModel> = emptyList()
        set(value) {
           field = value
            notifyDataSetChanged()
        }

    interface FilterAdapterCallback {
        fun onFilterItem(item: HospitalDomainModel, view: View)
    }

}