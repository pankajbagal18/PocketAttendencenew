package com.example.panks.pocketattendence3;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import static com.example.panks.pocketattendence3.R.layout.adapterview;

/**
 * Created by panks on 15/3/18.
 */

class CustomAdapter extends ArrayAdapter<String[]> {

    public CustomAdapter(Context context,String[][] subject) {
        super(context, R.layout.adapterview, subject);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflated = LayoutInflater.from(getContext());
        View customView = inflated.inflate(R.layout.adapterview,parent,false);
        TextView tv1 = (TextView) customView.findViewById(R.id.tv1);
        TextView tv2 = (TextView) customView.findViewById(R.id.tv2);
        String[] s1 = getItem(position);
        //String s2 = getItem(position);
            tv1.setText(s1[0]);
            tv2.setText(s1[1]);
            //tv2.setText(s1[1]);
        return customView;
    }
}
