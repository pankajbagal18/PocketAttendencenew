package com.example.panks.pocketattendence3;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main2Activity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView lst;
    String[][] subjects = new String[][]{{"Maths","90"},{"science","78"},{"physics","88"}};

    public Main2Activity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.todays_attendence);
        lst = (ListView)findViewById(R.id.lst);
        CustomAdapter myView = new CustomAdapter(this,subjects);
        lst.setAdapter(myView);
        lst.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> myView, View view, int i, long l) {
        Snackbar.make(view,"you clicked something", Snackbar.LENGTH_LONG).show();
    }
}
