package com.aba.hospital.ui.list.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aba.hospital.domain.model.HospitalDomainModel
import com.aba.testaba.R
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.item_filter.view.*

class FilterItemViewHolder(override val containerView: View,
                           private val callback: FilterListAdapter.FilterAdapterCallback
):
    RecyclerView.ViewHolder(containerView), LayoutContainer {

    companion object {
        fun create(
            parent: ViewGroup,
            callback: FilterListAdapter.FilterAdapterCallback
            ): FilterItemViewHolder = FilterItemViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(
                    R.layout.item_filter, parent, false
                ), callback
        )
    }

    fun bindView(item: HospitalDomainModel){
        itemView.title.text = item.organisationName
        itemView.setOnClickListener {
            callback.onFilterItem(item, itemView.title)
        }
    }

}