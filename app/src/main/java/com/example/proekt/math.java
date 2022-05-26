package com.example.proekt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class math extends AppCompatActivity {
    public static int bal = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);
        Button pl = (Button) findViewById(R.id.pl);
        Button pn = (Button) findViewById(R.id.pn);
        Button ps = (Button) findViewById(R.id.ps);
        Button ml = (Button) findViewById(R.id.ml);
        Button mn = (Button) findViewById(R.id.mn);
        Button ms = (Button) findViewById(R.id.ms);
        Button plus = (Button)findViewById(R.id.plus);
        Button minus = (Button)findViewById(R.id.minus);
        pl.setVisibility(View.GONE);
        pn.setVisibility(View.GONE);
        ps.setVisibility(View.GONE);
        ml.setVisibility(View.GONE);
        mn.setVisibility(View.GONE);
        ms.setVisibility(View.GONE);
        Button exit = (Button)findViewById(R.id.exit);
        exit.setVisibility(View.VISIBLE);
        TextView reg = (TextView) findViewById(R.id.glav);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i;
                i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pl.setVisibility(View.VISIBLE);
                pn.setVisibility(View.VISIBLE);
                ps.setVisibility(View.VISIBLE);
                plus.setVisibility(View.GONE);
                minus.setVisibility(View.GONE);
                reg.setText("ВЫБЕРИТЕ СЛОЖНСТЬ:");
                reg.setTextSize(40);
                exit.setVisibility(View.GONE);
            }
        });

        pn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i;
                i = new Intent(getApplicationContext(), plus.class);
                startActivity(i);
            }
        });

        mn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i;
                i = new Intent(getApplicationContext(), minus.class);
                startActivity(i);
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ml.setVisibility(View.VISIBLE);
                mn.setVisibility(View.VISIBLE);
                ms.setVisibility(View.VISIBLE);
                plus.setVisibility(View.GONE);
                minus.setVisibility(View.GONE);
                reg.setText("ВЫБЕРИТЕ СЛОЖНСТЬ:");
                reg.setTextSize(40);
                exit.setVisibility(View.GONE);
            }
        });
    }
}