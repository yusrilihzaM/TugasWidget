package com.yusril.tugaswidget

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.widget.Toast

@Suppress("DEPRECATION")
class WidgetImageButton : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_widget_image_button)
        if (supportActionBar != null) {
            supportActionBar!!.setBackgroundDrawable(resources.getDrawable(R.drawable.gradasi))
        }
    }

    fun firstImageButton() {
        Toast.makeText(applicationContext, "Kalian telah memilih imagebutton pertama", Toast.LENGTH_LONG).show()
    }

    fun secondImageButton() {
        Toast.makeText(applicationContext, "Kalian telah memilih imagebutton kedua", Toast.LENGTH_LONG).show()
    }
}
