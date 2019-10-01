package com.yusril.tugaswidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class WidgetCheckBox extends AppCompatActivity {
    CheckBox cb1, cb2,cb3,cb4,cb5,cb6;
    Button btn1;
    String a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widget_check_box);
        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        cb3 = findViewById(R.id.cb3);
        cb4 = findViewById(R.id.cb4);
        cb5 = findViewById(R.id.cb5);
        cb6 = findViewById(R.id.cb6);
        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a="";
                if(cb1.isChecked()){
                    a+="Bahasa Java\n";

                }
                if(cb2.isChecked()){
                    a+="Bahasa PHP\n";

                }
                if(cb3.isChecked()){
                    a+="Bahasa C++\n";

                }
                if(cb4.isChecked()){
                    a+="Bahasa Actionscript\n";
                }
                if(cb5.isChecked()){
                    a+="Bahasa Phyton\n";
                }
                if(cb6.isChecked()){
                    a+="Bahasa Javascript\n";


                }



            }

        });
        Toast.makeText(this, "Kalian memilih :  \n "+a,
                Toast.LENGTH_SHORT).show();
    }
}
