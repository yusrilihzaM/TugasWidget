@file:Suppress("DEPRECATION")

package com.yusril.tugaswidget

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.view.View
import android.widget.AnalogClock
import android.widget.Button

class WidgetAnalogClock : AppCompatActivity() {
    private lateinit var analogClock: AnalogClock
    internal lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_widget_analog_clock)
        analogClock = findViewById<View>(R.id.analogClock) as AnalogClock
        button = findViewById<View>(R.id.button) as Button
        analogClock.visibility = View.INVISIBLE
        if (supportActionBar != null) {
            supportActionBar!!.setBackgroundDrawable(resources.getDrawable(R.drawable.gradasi))
        }
    }

    @SuppressLint("SetTextI18n")
    fun onButtonClicked() {
        button.text = "Analog Clock"
        analogClock.visibility = View.VISIBLE
    }
}
