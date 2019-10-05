package com.yusril.tugaswidget.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.yusril.tugaswidget.*
import java.util.*

class AdapterMain(private val judul: ArrayList<String> //Digunakan untuk Judul
                  , private val deskripsi: ArrayList<String> //Digunakan untuk deskripsi
) : RecyclerView.Adapter<AdapterMain.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val nama = judul[position]
        holder.judul.text = nama
        holder.deskripsi.text = deskripsi[position]
    }

    override fun getItemCount(): Int {
        return judul.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        internal var judul: TextView = itemView.findViewById(R.id.judul)
        internal var deskripsi: TextView = itemView.findViewById(R.id.descripion)
        private val itemList: CardView = itemView.findViewById(R.id.item_list)
        private val context: Context = itemView.context

        init {
            itemList.setOnClickListener {
                var intent = Intent()
                when (adapterPosition) {
                    0 -> intent = Intent(context, WidgetTextView::class.java)
                    1 -> intent = Intent(context, WidgetImageView::class.java)
                    2 -> intent = Intent(context, WidgetImageButton::class.java)
                    3 -> intent = Intent(context, WidgetEditText::class.java)
                    4 -> intent = Intent(context, WidgetCheckBox::class.java)
                    5 -> intent = Intent(context, WidgetRadioButton::class.java)
                    6 -> intent = Intent(context, WidgetDatePicker::class.java)
                    7 -> intent = Intent(context, WidgetTimePicker::class.java)
                    8 -> intent = Intent(context, WidgetSwitchButton::class.java)
                    9 -> intent = Intent(context, WidgetDigitalClock::class.java)
                    10 -> intent = Intent(context, WidgetAnalogClock::class.java)
                }
                context.startActivity(intent)
            }
        }
    }
}
