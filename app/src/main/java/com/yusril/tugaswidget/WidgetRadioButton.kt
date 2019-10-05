package com.yusril.tugaswidget

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

@Suppress("DEPRECATION")
class WidgetRadioButton : AppCompatActivity(), RadioGroup.OnCheckedChangeListener {

    private lateinit var rb1: RadioButton
    private lateinit var rb2: RadioButton
    private lateinit var rg: RadioGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_widget_radio_button)
        rg = findViewById(R.id.rg)
        rb1 = findViewById(R.id.rbbaso)
        rb2 = findViewById(R.id.rbMie)
        rg.setOnCheckedChangeListener(this)
        if (supportActionBar != null) {
            supportActionBar!!.setBackgroundDrawable(resources.getDrawable(R.drawable.gradasi))
        }
    }

    override fun onCheckedChanged(radioGroup: RadioGroup, i: Int) {
        if (i == R.id.rbbaso) {
            Toast.makeText(this, "Anda Membeli Baso Tahu",
                    Toast.LENGTH_SHORT).show()

        }
        if (i == R.id.rbMie) {
            Toast.makeText(this, "Anda Membeli Mie Ayam", Toast.LENGTH_SHORT).show()
        }

    }
}
