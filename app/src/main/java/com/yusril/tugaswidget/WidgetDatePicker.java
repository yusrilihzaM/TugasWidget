package com.yusril.tugaswidget;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class WidgetDatePicker extends AppCompatActivity {

    DatePicker datePicker;
    TextView displayDate;
    Button changeDate;
    int month;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widget_date_picker);
        datePicker = findViewById(R.id.datePicker);
        displayDate = findViewById(R.id.display_date);
        displayDate.setText("Display Date");
        changeDate = findViewById(R.id.change_date_button);

        displayDate.setText(currentDate());
        changeDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayDate.setText(currentDate());
            }
        });
    }
    public String currentDate() {
        StringBuilder mcurrentDate = new StringBuilder();
        month = datePicker.getMonth() + 1;
        mcurrentDate.append("Date: ").append(month).append("/").append(datePicker.getDayOfMonth()).append("/").append(datePicker.getYear());
        return mcurrentDate.toString();
    }
}
