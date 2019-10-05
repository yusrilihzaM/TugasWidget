package com.yusril.tugaswidget

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

@Suppress("DEPRECATION")
class WidgetEditText : AppCompatActivity() {
    private lateinit var firstName: EditText
    private lateinit var lastName: EditText
    private lateinit var displayname: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_widget_edit_text)
        firstName = findViewById(R.id.firstName)
        lastName = findViewById(R.id.lastName)
        displayname = findViewById(R.id.displayName)
        if (supportActionBar != null) {
            supportActionBar!!.setBackgroundDrawable(resources.getDrawable(R.drawable.gradasi))
        }
    }

    @SuppressLint("SetTextI18n")
    fun display() {
        val getFirstName = firstName.text.toString()
        val getLastName = lastName.text.toString()
        displayname.text = "Nama saya adalah $getFirstName $getLastName"
    }
}
