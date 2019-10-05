package com.yusril.tugaswidget

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

@Suppress("DEPRECATION")
class WidgetImageView : AppCompatActivity() {
    private lateinit var imageView: ImageView
    private lateinit var nextImage: Button
    private lateinit var previousImage: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_widget_image_view)
        imageView = findViewById(R.id.image_view)
        nextImage = findViewById(R.id.next_image)
        previousImage = findViewById(R.id.previous_image)
        previousImage.visibility = View.INVISIBLE
        if (supportActionBar != null) {
            supportActionBar!!.setBackgroundDrawable(resources.getDrawable(R.drawable.gradasi))
        }
    }

    fun nextImage() {

        imageView.setImageResource(R.drawable.yusril1)
        previousImage.visibility = View.VISIBLE
        nextImage.visibility = View.INVISIBLE
    }


    fun previousImage() {
        imageView.setImageResource(R.drawable.marko)
        previousImage.visibility = View.INVISIBLE
        nextImage.visibility = View.VISIBLE
    }
}
