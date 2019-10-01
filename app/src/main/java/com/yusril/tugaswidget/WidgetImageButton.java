package com.yusril.tugaswidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class WidgetImageButton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widget_image_button);
    }
    public void firstImageButton(View view) {
        Toast.makeText(getApplicationContext(), "Kalian telah memilih imagebutton pertama", Toast.LENGTH_LONG).show();
    }

    public void secondImageButton(View view) {
        Toast.makeText(getApplicationContext(), "Kalian telah memilih imagebutton kedua", Toast.LENGTH_LONG).show();
    }
}
