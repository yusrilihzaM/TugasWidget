@file:Suppress("DEPRECATION")

package com.yusril.tugaswidget

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.DigitalClock

@Suppress("DEPRECATION")
class WidgetDigitalClock : AppCompatActivity() {
    private lateinit var digitalClock1: DigitalClock
    private lateinit var showAnotherDigitalClock: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_widget_digital_clock)
        findViewById<View>(R.id.digitalClock) as DigitalClock
        if (supportActionBar != null) {
            supportActionBar!!.setBackgroundDrawable(resources.getDrawable(R.drawable.gradasi))
        }
        digitalClock1 = findViewById<View>(R.id.digitalClock1) as DigitalClock
        digitalClock1.visibility = View.INVISIBLE

        showAnotherDigitalClock = findViewById<View>(R.id.showDigitalClock) as Button
    }

    @SuppressLint("SetTextI18n")
    fun showDigitalClock() {
        digitalClock1.visibility = View.VISIBLE
        showAnotherDigitalClock.text = "Menampilkan DigitalClock"
    }
}
