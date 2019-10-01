package com.yusril.tugaswidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class WidgetTimePicker extends AppCompatActivity {
    TimePicker timePicker;
    TextView displayTime;
    Button changeTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widget_time_picker);
        timePicker = findViewById(R.id.timePicker);
        displayTime = findViewById(R.id.textView);
        changeTime = findViewById(R.id.bchange_time);

        timePicker.setIs24HourView(true);
        displayTime.setText(currentTime());
        changeTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayTime.setText(currentTime());
            }
        });
    }
    public String currentTime() {
        String mcurrentTime = "Time: " + timePicker.getCurrentHour() + ":" + timePicker.getCurrentMinute();
        return mcurrentTime;
    }
}
