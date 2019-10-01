package com.yusril.tugaswidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Button;

@SuppressWarnings("ALL")
public class WidgetAnalogClock extends AppCompatActivity {
    AnalogClock analogClock;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widget_analog_clock);
        analogClock = (AnalogClock) findViewById(R.id.analogClock);
        button = (Button) findViewById(R.id.button);
        analogClock.setVisibility(View.INVISIBLE);
    }

    public void onButtonClicked(View view) {
        button.setText("Analog Clock");
        analogClock.setVisibility(View.VISIBLE);
    }
}
