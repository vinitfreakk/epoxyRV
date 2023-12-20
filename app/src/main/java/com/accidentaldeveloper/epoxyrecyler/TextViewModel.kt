package com.accidentaldeveloper.epoxyrecyler

import android.view.View
import android.view.ViewParent
import android.widget.TextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelWithHolder

abstract class TextViewModel : EpoxyModelWithHolder<TextViewModel.TextViewHolder>() {

    @EpoxyAttribute
    var text: String? = null

    override fun bind(holder: TextViewHolder) {
        holder.textView.text = text
    }

    class TextViewHolder : EpoxyHolder() {

        lateinit var textView: TextView

        override fun bindView(itemView: View) {
            textView = itemView.findViewById<TextView>(R.id.header_title)
        }


    }
}