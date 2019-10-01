package com.yusril.tugaswidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class WidgetEditText extends AppCompatActivity {
    EditText firstName, lastName;
    TextView displayname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widget_edit_text);
        firstName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.lastName);
        displayname = findViewById(R.id.displayName);
    }
    public void display(View view) {
        String getFirstName = firstName.getText().toString();
        String getLastName = lastName.getText().toString();
        displayname.setText("Nama saya adalah " + getFirstName + " " + getLastName);
    }
}
