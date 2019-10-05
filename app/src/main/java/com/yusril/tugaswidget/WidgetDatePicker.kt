package com.yusril.tugaswidget

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

@Suppress("DEPRECATION")
class WidgetDatePicker : AppCompatActivity() {

    private lateinit var datePicker: DatePicker
    private lateinit var displayDate: TextView
    private lateinit var changeDate: Button
    private var month: Int = 0
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_widget_date_picker)
        datePicker = findViewById(R.id.datePicker)
        displayDate = findViewById(R.id.display_date)
        displayDate.text = "Display Date"
        changeDate = findViewById(R.id.change_date_button)
        if (supportActionBar != null) {
            supportActionBar!!.setBackgroundDrawable(resources.getDrawable(R.drawable.gradasi))
        }
        displayDate.text = currentDate()
        changeDate.setOnClickListener { displayDate.text = currentDate() }
    }

    private fun currentDate(): String {
        val mcurrentDate = StringBuilder()
        month = datePicker.month + 1
        mcurrentDate.append("Date: ").append(month).append("/").append(datePicker.dayOfMonth).append("/").append(datePicker.year)
        return mcurrentDate.toString()
    }
}
