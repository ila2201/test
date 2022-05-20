package com.example.proekt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class plus extends AppCompatActivity {
    String a = " + ";
    String b = " = ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plus);
        Random r = new Random();
        int i = r.nextInt(45 - 28)+28;
        int i1 = r.nextInt(45 - 28) + 28;
        int ot = i+i1;

        TextView tv = (TextView) findViewById(R.id.prim);
        tv.setText(String.format("%s %s %s", i, a, i1));
        Button v1 = (Button) findViewById(R.id.v1);
        Button v2 = (Button) findViewById(R.id.v2);
        Button v3 = (Button) findViewById(R.id.v3);
        Button v4 = (Button) findViewById(R.id.v4);
        Button re = (Button) findViewById(R.id.re);
        re.setVisibility(View.GONE);
        int k = r.nextInt(4)+1;
        int va1 = 0;
        int va2 = 0;
        int va3 = 0;
        int va4 = 0;
        if (k == 1){
            va1=i+i1;
            va2=i+i1-5;
            va3=i+i1+3;
            va4=i+i1-2;
        }
        if (k == 2){
            va1=i+i1-3;
            va2=i+i1;
            va3=i+i1+2;
            va4=i+i1+4;
        }
        if (k == 3){
            va1=i+i1+3;
            va2=i+i1-2;
            va3=i+i1;
            va4=i+i1+5;
        }
        if (k == 4){
            va1=i+i1-3;
            va2=i+i1-5;
            va3=i+i1+2;
            va4=i+i1;
        }
        v1.setText(Integer.toString(va1));
        v2.setText(Integer.toString(va2));
        v3.setText(Integer.toString(va3));
        v4.setText(Integer.toString(va4));
        TextView gl = (TextView) findViewById(R.id.glav1);

        int finalVa = va1;
        v1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (finalVa == i1+i){
                    gl.setText("ВЕРНО!");
                }
                else{
                    gl.setText("ОШИБКА!");
                }
                tv.setText(String.format("%s %s %s %s %S", i, a, i1, b, ot));
                v2.setVisibility(View.GONE);
                v3.setVisibility(View.GONE);
                v4.setVisibility(View.GONE);
                re.setVisibility(View.VISIBLE);

            }
        });
        int finalVa1 = va2;
        v2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (finalVa1 == i1+i){
                    gl.setText("ВЕРНО!");
                }
                else{
                    gl.setText("ОШИБКА!");
                }
                tv.setText(String.format("%s %s %s %s %S", i, a, i1, b, ot));
                v1.setVisibility(View.GONE);
                v3.setVisibility(View.GONE);
                v4.setVisibility(View.GONE);
                re.setVisibility(View.VISIBLE);

            }
        });
        int finalVa2 = va3;
        v3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (finalVa2 == i1+i){
                    gl.setText("ВЕРНО!");
                }
                else{
                    gl.setText("ОШИБКА!");
                }
                tv.setText(String.format("%s %s %s %s %S", i, a, i1, b, ot));
                v1.setVisibility(View.GONE);
                v2.setVisibility(View.GONE);
                v4.setVisibility(View.GONE);
                re.setVisibility(View.VISIBLE);

            }
        });
        int finalVa3 = va4;
        v4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (finalVa3 == i1+i){
                    gl.setText("ВЕРНО!");
                }
                else{
                    gl.setText("ОШИБКА!");
                }
                tv.setText(String.format("%s %s %s %s %S", i, a, i1, b, ot));
                v1.setVisibility(View.GONE);
                v2.setVisibility(View.GONE);
                v3.setVisibility(View.GONE);
                re.setVisibility(View.VISIBLE);

            }
        });
        re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i;
                i = new Intent(getApplicationContext(), plus.class);
                startActivity(i);
            }
        });

    }
}