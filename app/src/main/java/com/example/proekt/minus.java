package com.example.proekt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;

import java.util.Random;

public class minus extends AppCompatActivity {
    String a = " - ";
    String b = " = ";
    String c = "Решено: ";
    String d = "Время: ";
    Random r = new Random();
    int i = r.nextInt(90)+10;
    int i1 = r.nextInt(90) +10;

    private Chronometer chronometerCountDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minus);
        this.chronometerCountDown = (Chronometer) findViewById(R.id.time);
        Random r = new Random();
        this.chronometerCountDown.start();

        int del = i1;
        if (i1>i){
            i1 = i;
            i = del;
        }
        int ot = i-i1;
        TextView tv = (TextView) findViewById(R.id.prim);
        TextView tim = (TextView) findViewById(R.id.bal);
        tv.setText(String.format("%s %s %s", i, a, i1));
        Button v1 = (Button) findViewById(R.id.v1);
        Button v2 = (Button) findViewById(R.id.v2);
        Button v3 = (Button) findViewById(R.id.v3);
        Button v4 = (Button) findViewById(R.id.v4);
        tim.setText(String.format("%s %s",c, Matematika.bal));
        int k = r.nextInt(4)+1;
        int va1 = 0;
        int va2 = 0;
        int va3 = 0;
        int va4 = 0;
        if (k == 1){
            va1=i-i1;
            va2=i-i1-5;
            va3=i-i1+3;
            va4=i-i1-2;
        }
        if (k == 2){
            va1=i-i1-3;
            va2=i-i1;
            va3=i-i1+2;
            va4=i-i1+4;
        }
        if (k == 3){
            va1=i-i1+3;
            va2=i-i1-2;
            va3=i-i1;
            va4=i-i1+5;
        }
        if (k == 4){
            va1=i-i1-3;
            va2=i-i1-5;
            va3=i-i1+2;
            va4=i-i1;
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
                if (finalVa == ot){
                    gl.setText("ВЕРНО!");
                    Matematika.bal= Matematika.bal+1;
                    tim.setText(String.format("%s %s",c, Matematika.bal));
                }
                else{
                    gl.setText("ОШИБКА!");
                    Matematika.resho= Matematika.resho+1;
                }
                gl.setTextSize(59);
                tv.setText(String.format("%s %s %s %s %S", i, a, i1, b, ot));
                v1.setVisibility(View.GONE);
                v2.setVisibility(View.GONE);
                v3.setVisibility(View.GONE);
                v4.setVisibility(View.GONE);
                Intent i;
                i = new Intent(getApplicationContext(), minus.class);
                startActivity(i);
            }
        });
        int finalVa1 = va2;
        v2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (finalVa1 == ot){
                    gl.setText("ВЕРНО!");
                    Matematika.bal= Matematika.bal+1;
                    tim.setText(String.format("%s %s",c, Matematika.bal));
                }
                else{
                    gl.setText("ОШИБКА!");
                    Matematika.resho= Matematika.resho+1;
                }
                gl.setTextSize(59);
                tv.setText(String.format("%s %s %s %s %S", i, a, i1, b, ot));
                v1.setVisibility(View.GONE);
                v2.setVisibility(View.GONE);
                v3.setVisibility(View.GONE);
                v4.setVisibility(View.GONE);
                Intent i;
                i = new Intent(getApplicationContext(), minus.class);
                startActivity(i);
            }
        });
        int finalVa2 = va3;
        v3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (finalVa2 == ot){
                    gl.setText("ВЕРНО!");
                    Matematika.bal= Matematika.bal+1;
                    tim.setText(String.format("%s %s",c, Matematika.bal));
                }
                else{
                    gl.setText("ОШИБКА!");
                    Matematika.resho= Matematika.resho+1;
                }
                gl.setTextSize(59);
                tv.setText(String.format("%s %s %s %s %S", i, a, i1, b, ot));
                v1.setVisibility(View.GONE);
                v2.setVisibility(View.GONE);
                v3.setVisibility(View.GONE);
                v4.setVisibility(View.GONE);
                Intent i;
                i = new Intent(getApplicationContext(), minus.class);
                startActivity(i);
            }
        });
        int finalVa3 = va4;
        v4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (finalVa3 == ot){
                    gl.setText("ВЕРНО!");
                    Matematika.bal= Matematika.bal+1;
                    tim.setText(String.format("%s %s",c, Matematika.bal));
                }
                else{
                    gl.setText("ОШИБКА!");
                    Matematika.resho= Matematika.resho+1;
                }
                gl.setTextSize(59);
                tv.setText(String.format("%s %s %s %s %S", i, a, i1, b, ot));
                v1.setVisibility(View.GONE);
                v2.setVisibility(View.GONE);
                v3.setVisibility(View.GONE);
                v4.setVisibility(View.GONE);
                Intent i;
                i = new Intent(getApplicationContext(), minus.class);
                startActivity(i);

            }
        });

        this.chronometerCountDown.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
            @Override
            public void onChronometerTick(Chronometer chronometer) {
                onChronometerTickHandler();
            }
        });
    }
    public void onChronometerTickHandler()  {
        if(Matematika.time < 1) {
            Intent i;
            i = new Intent(getApplicationContext(), plusitog.class);
            startActivity(i);
        }
        this.chronometerCountDown.setText(String.format("%s %s",d, Matematika.time));
        Matematika.time--;
    }


}