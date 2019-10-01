package com.yusril.tugaswidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class WidgetRadioButton extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    RadioButton rb1,rb2;
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widget_radio_button);
        rg = findViewById(R.id.rg);
        rb1 = findViewById(R.id.rbbaso);
        rb2 = findViewById(R.id.rbMie);
        rg.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        if(i==R.id.rbbaso)
        {
            Toast.makeText(this, "Anda Membeli Baso Tahu",
                    Toast.LENGTH_SHORT).show();

        }
        if(i==R.id.rbMie)
        {
            Toast.makeText(this, "Anda Membeli Mie Ayam", Toast.LENGTH_SHORT).show();
        }

    }
}
