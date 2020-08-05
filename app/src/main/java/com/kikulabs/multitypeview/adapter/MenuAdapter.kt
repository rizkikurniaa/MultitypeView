package com.kikulabs.multitypeview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kikulabs.multitypeview.R
import com.kikulabs.multitypeview.model.MenuItem
import com.kikulabs.multitypeview.viewHolder.MenuHeaderHolder
import com.kikulabs.multitypeview.viewHolder.MenuItemHolder

class MenuAdapter(private val data: List<Any>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    companion object {
        private const val ITEM_HEADER = 0
        private const val ITEM_MENU = 1
    }

    override fun getItemViewType(position: Int): Int {
        return when (data[position]) {
            is String -> ITEM_HEADER
            is MenuItem -> ITEM_MENU
            else -> throw IllegalArgumentException("Undefined view type")
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            ITEM_HEADER -> MenuHeaderHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.item_header, parent, false)
            )
            ITEM_MENU -> MenuItemHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.item_menu, parent, false)
            )
            else -> throw throw IllegalArgumentException("Undefined view type")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder.itemViewType) {
            ITEM_HEADER -> {
                val headerHolder = holder as MenuHeaderHolder
                headerHolder.bindContent(data[position] as String)
            }
            ITEM_MENU -> {
                val itemHolder = holder as MenuItemHolder
                itemHolder.bindContent(data[position] as MenuItem)
            }
            else -> throw IllegalArgumentException("Undefined view type")
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }
}