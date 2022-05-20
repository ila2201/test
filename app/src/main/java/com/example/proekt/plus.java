package com.example.proekt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class plus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plus);
        Random r = new Random();
        int i = r.nextInt(45 - 28) + 28;
        TextView tv = (TextView) findViewById(R.id.glav);
        tv.setText(Integer.toString(i));
    }
}