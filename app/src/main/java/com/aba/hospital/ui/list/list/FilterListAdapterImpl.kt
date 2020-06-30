package com.aba.hospital.ui.list.list

import android.view.ViewGroup
import javax.inject.Inject

class FilterListAdapterImpl @Inject constructor(private val callback: FilterListAdapter.FilterAdapterCallback) :
    FilterListAdapter<FilterItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        FilterItemViewHolder.create(parent, callback)

    override fun getItemCount() = filterItems.size

    override fun onBindViewHolder(holder: FilterItemViewHolder, position: Int) {
        holder.bindView(filterItems[position])
    }
}