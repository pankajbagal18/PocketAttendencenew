package com.example.panks.pocketattendence3;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

public class Add_subject extends AppCompatActivity {

    EditText edit1;
    Button add_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_subject);
        add_button = (Button)findViewById(R.id.Add_button);
        edit1 = (EditText)findViewById(R.id.add_sub1);
        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                String subject1;
                subject1 = String.valueOf(edit1.getText());
                Snackbar.make(view1,"added"+subject1,Snackbar.LENGTH_LONG).show();
            }
        });

    }
}
