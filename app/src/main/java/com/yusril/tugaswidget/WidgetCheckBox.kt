package com.yusril.tugaswidget

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

@Suppress("DEPRECATION")
class WidgetCheckBox : AppCompatActivity() {
    private lateinit var cb1: CheckBox
    private lateinit var cb2: CheckBox
    private lateinit var cb3: CheckBox
    private lateinit var cb4: CheckBox
    private lateinit var cb5: CheckBox
    private lateinit var cb6: CheckBox
    private lateinit var btn1: Button
    private var a: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_widget_check_box)
        if (supportActionBar != null) {
            supportActionBar!!.setBackgroundDrawable(resources.getDrawable(R.drawable.gradasi))
        }
        cb1 = findViewById(R.id.cb1)
        cb2 = findViewById(R.id.cb2)
        cb3 = findViewById(R.id.cb3)
        cb4 = findViewById(R.id.cb4)
        cb5 = findViewById(R.id.cb5)
        cb6 = findViewById(R.id.cb6)
        btn1 = findViewById(R.id.btn1)
        btn1.setOnClickListener {
            var a = ""
            if (cb1.isChecked) {
                a += "Bahasa Java\n"

            }
            if (cb2.isChecked) {
                a += "Bahasa PHP\n"

            }
            if (cb3.isChecked) {
                a += "Bahasa C++\n"

            }
            if (cb4.isChecked) {
                a += "Bahasa Actionscript\n"
            }
            if (cb5.isChecked) {
                a += "Bahasa Phyton\n"
            }
            if (cb6.isChecked) {
                a += "Bahasa Javascript\n"


            }
        }
        Toast.makeText(this, "Kalian memilih :  \n " + a!!,
                Toast.LENGTH_SHORT).show()
    }
}
