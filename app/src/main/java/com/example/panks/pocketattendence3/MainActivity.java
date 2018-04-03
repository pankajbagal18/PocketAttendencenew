package com.example.panks.pocketattendence3;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    com.github.clans.fab.FloatingActionButton addt;
    com.github.clans.fab.FloatingActionButton adds;
    com.github.clans.fab.FloatingActionButton viewt;
    EditText edit1;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addt = (com.github.clans.fab.FloatingActionButton)findViewById(R.id.addT);
        viewt = (com.github.clans.fab.FloatingActionButton)findViewById(R.id.viewT);
        adds = (com.github.clans.fab.FloatingActionButton)findViewById(R.id.addS);
        edit1 = (EditText)findViewById(R.id.add_sub1);
        button = (Button)findViewById(R.id.Add_button);
        viewt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });

        adds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder addsub = new AlertDialog.Builder(MainActivity.this);
                View view1 = getLayoutInflater().inflate(R.layout.activity_add_subject,null);
                addsub.setView(view1);
                addsub.create().show();
            }
        });
    }
}
