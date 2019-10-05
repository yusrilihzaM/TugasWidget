package com.yusril.tugaswidget

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle

@Suppress("DEPRECATION")
class WidgetTextView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_widget_text_view)
        if (supportActionBar != null) {
            supportActionBar!!.setBackgroundDrawable(resources.getDrawable(R.drawable.gradasi))
        }
    }
}
