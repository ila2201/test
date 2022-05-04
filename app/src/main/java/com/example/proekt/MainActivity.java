package com.example.proekt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonk = (Button)findViewById(R.id.buttonk);
        buttonk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i;
                i = new Intent(getApplicationContext(), kosti.class);
                startActivity(i);
            }
        });
        Button buttonch = (Button)findViewById(R.id.buttonch);
        buttonch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i;
                i = new Intent(getApplicationContext(), chislo.class);
                startActivity(i);
            }
        });
        Button buttonma = (Button)findViewById(R.id.buttonma);
        buttonma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i;
                i = new Intent(getApplicationContext(), math.class);
                startActivity(i);
            }
        });

    }

    @Override
    public void onClick(View view) {

    }
}