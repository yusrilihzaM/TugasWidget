package com.yusril.tugaswidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class WidgetImageView extends AppCompatActivity {
    ImageView imageView;
    Button nextImage, previousImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widget_image_view);
        imageView =  findViewById(R.id.image_view);
        nextImage =  findViewById(R.id.next_image);
        previousImage =  findViewById(R.id.previous_image);
        previousImage.setVisibility(View.INVISIBLE);
    }

    public void nextImage(View view) {

        imageView.setImageResource(R.drawable.yusril1);
        previousImage.setVisibility(View.VISIBLE);
        nextImage.setVisibility(View.INVISIBLE);
    }


    public void previousImage(View view) {
        imageView.setImageResource(R.drawable.marko);
        previousImage.setVisibility(View.INVISIBLE);
        nextImage.setVisibility(View.VISIBLE);
    }
}
