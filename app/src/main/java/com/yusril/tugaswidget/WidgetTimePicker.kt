package com.yusril.tugaswidget

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.TimePicker
import androidx.appcompat.app.AppCompatActivity

@Suppress("DEPRECATION")
class WidgetTimePicker : AppCompatActivity() {
    private lateinit var timePicker: TimePicker
    private lateinit var displayTime: TextView
    private lateinit var changeTime: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_widget_time_picker)
        timePicker = findViewById(R.id.timePicker)
        displayTime = findViewById(R.id.textView)
        changeTime = findViewById(R.id.bchange_time)
        if (supportActionBar != null) {
            supportActionBar!!.setBackgroundDrawable(resources.getDrawable(R.drawable.gradasi))
        }
        timePicker.setIs24HourView(true)
        displayTime.text = currentTime()
        changeTime.setOnClickListener { displayTime.text = currentTime() }
    }

    private fun currentTime(): String {
        return "Time: " + timePicker.currentHour + ":" + timePicker.currentMinute
    }
}
