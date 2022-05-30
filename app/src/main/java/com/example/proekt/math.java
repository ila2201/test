package com.example.proekt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class math extends AppCompatActivity {
    public static int bal = 0;
    public static int time = 60;
    public static int resho = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);
        Button pn = (Button) findViewById(R.id.pn);
        Button ps = (Button) findViewById(R.id.ps);
        Button mn = (Button) findViewById(R.id.mn);
        Button ms = (Button) findViewById(R.id.ms);
        Button plus = (Button)findViewById(R.id.plus);
        Button minus = (Button)findViewById(R.id.minus);
        Button prn = (Button) findViewById(R.id.prn);
        Button prs = (Button) findViewById(R.id.prs);
        Button proi = (Button) findViewById(R.id.proisv);
        Button del = (Button) findViewById(R.id.del);
        Button ds = (Button) findViewById(R.id.ds);
        Button dn = (Button) findViewById(R.id.dn);
        Button kor = (Button) findViewById(R.id.kor);
        Button prst = (Button) findViewById(R.id.prst);
        kor.setVisibility(View.GONE);
        pn.setVisibility(View.GONE);
        ps.setVisibility(View.GONE);
        mn.setVisibility(View.GONE);
        ms.setVisibility(View.GONE);
        prs.setVisibility(View.GONE);
        prn.setVisibility(View.GONE);
        ds.setVisibility(View.GONE);
        dn.setVisibility(View.GONE);
        prst.setVisibility(View.GONE);
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
                pn.setVisibility(View.VISIBLE);
                ps.setVisibility(View.VISIBLE);
                plus.setVisibility(View.GONE);
                minus.setVisibility(View.GONE);
                proi.setVisibility(View.GONE);
                del.setVisibility(View.GONE);
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

        ps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i;
                i = new Intent(getApplicationContext(), pluss.class);
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
        ms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i;
                i = new Intent(getApplicationContext(), minuss.class);
                startActivity(i);
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mn.setVisibility(View.VISIBLE);
                ms.setVisibility(View.VISIBLE);
                plus.setVisibility(View.GONE);
                minus.setVisibility(View.GONE);
                proi.setVisibility(View.GONE);
                del.setVisibility(View.GONE);
                reg.setText("ВЫБЕРИТЕ СЛОЖНСТЬ:");
                reg.setTextSize(40);
                exit.setVisibility(View.GONE);
            }
        });

        proi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                prn.setVisibility(View.VISIBLE);
                prs.setVisibility(View.VISIBLE);
                prst.setVisibility(View.VISIBLE);
                plus.setVisibility(View.GONE);
                minus.setVisibility(View.GONE);
                proi.setVisibility(View.GONE);
                del.setVisibility(View.GONE);
                reg.setText("ВЫБЕРИТЕ СЛОЖНСТЬ:");
                reg.setTextSize(40);
                exit.setVisibility(View.GONE);
            }
        });

        prn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i;
                i = new Intent(getApplicationContext(), proisv.class);
                startActivity(i);
            }
        });
        prs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i;
                i = new Intent(getApplicationContext(), proisvs.class);
                startActivity(i);
            }
        });
        prst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i;
                i = new Intent(getApplicationContext(), proisvst.class);
                startActivity(i);
            }
        });

        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dn.setVisibility(View.VISIBLE);
                ds.setVisibility(View.VISIBLE);
                kor.setVisibility(View.VISIBLE);
                plus.setVisibility(View.GONE);
                minus.setVisibility(View.GONE);
                proi.setVisibility(View.GONE);
                del.setVisibility(View.GONE);
                reg.setText("ВЫБЕРИТЕ СЛОЖНСТЬ:");
                reg.setTextSize(40);
                exit.setVisibility(View.GONE);
            }
        });

        dn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i;
                i = new Intent(getApplicationContext(), del.class);
                startActivity(i);
            }
        });
        ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i;
                i = new Intent(getApplicationContext(), dels.class);
                startActivity(i);
            }
        });
        kor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i;
                i = new Intent(getApplicationContext(), koren.class);
                startActivity(i);
            }
        });
    }
}