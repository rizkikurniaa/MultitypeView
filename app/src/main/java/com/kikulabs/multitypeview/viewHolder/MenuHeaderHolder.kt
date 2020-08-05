package com.kikulabs.multitypeview.viewHolder

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kikulabs.multitypeview.R

class MenuHeaderHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val itemHeader = itemView.findViewById(R.id.tvHeaderItem) as TextView

    fun bindContent(text: String) {
        itemHeader.text = text
    }
}