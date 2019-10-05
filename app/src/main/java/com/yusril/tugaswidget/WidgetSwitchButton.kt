package com.yusril.tugaswidget

import android.os.Bundle
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

@Suppress("DEPRECATION")
class WidgetSwitchButton : AppCompatActivity() {
    private lateinit var switchButton: Switch
    private lateinit var switchButton2: Switch
    private lateinit var textView: TextView
    private lateinit var textView2: TextView
    private var switchOn = "Switch is ON"
    private var switchOff = "Switch is OFF"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_widget_switch_button)
        // For first switch button
        switchButton = findViewById(R.id.switchButton)
        textView = findViewById(R.id.textView)
        if (supportActionBar != null) {
            supportActionBar!!.setBackgroundDrawable(resources.getDrawable(R.drawable.gradasi))
        }
        switchButton.isChecked = true
        switchButton.setOnCheckedChangeListener { _, bChecked ->
            if (bChecked) {
                textView.text = switchOn
            } else {
                textView.text = switchOff
            }
        }

        if (switchButton.isChecked) {
            textView.text = switchOn
        } else {
            textView.text = switchOff
        }

        // for second switch button
        switchButton2 = findViewById(R.id.switchButton2)
        textView2 = findViewById(R.id.textView2)

        switchButton2.isChecked = false
        switchButton2.setOnCheckedChangeListener { _, bChecked ->
            if (bChecked) {
                textView2.text = switchOn
            } else {
                textView2.text = switchOff
            }
        }

        if (switchButton2.isChecked) {
            textView2.text = switchOn
        } else {
            textView2.text = switchOff
        }
    }
}
