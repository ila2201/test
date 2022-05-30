package com.example.proekt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;

import java.util.Random;

public class proisvst extends AppCompatActivity {
    String a = " * ";
    String b = " = ";
    String c = "Решено: ";
    String d = "Время: ";
    private Chronometer chronometerCountDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plus);
        this.chronometerCountDown = (Chronometer) findViewById(R.id.time);
        Random r = new Random();
        this.chronometerCountDown.start();
        int i = r.nextInt(90)+9;
        int ot = i*i;
        TextView tv = (TextView) findViewById(R.id.prim);
        TextView tim = (TextView) findViewById(R.id.bal);
        TextView gla = (TextView) findViewById(R.id.glav);
        gla.setText("Степени");
        tv.setText(String.format("%s %s %s", i, a, i));
        Button v1 = (Button) findViewById(R.id.v1);
        Button v2 = (Button) findViewById(R.id.v2);
        Button v3 = (Button) findViewById(R.id.v3);
        Button v4 = (Button) findViewById(R.id.v4);
        tim.setText(String.format("%s %s",c,math.bal));
        int k = r.nextInt(4)+1;
        int va1 = 0;
        int va2 = 0;
        int va3 = 0;
        int va4 = 0;
        if (k == 1){
            va1=i*i;
            va2=i*i-50;
            va3=i*i+33;
            va4=i*i-20;
        }
        if (k == 2){
            va1=i*i-35;
            va2=i*i;
            va3=i*i+20;
            va4=i*i+40;
        }
        if (k == 3){
            va1=i*i+34;
            va2=i*i-20;
            va3=i*i;
            va4=i*i+50;
        }
        if (k == 4){
            va1=i*i-37;
            va2=i*i-50;
            va3=i*i+20;
            va4=i*i;
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
                if (finalVa == i*i){
                    gl.setText("ВЕРНО!");
                    math.bal=math.bal+1;
                    tim.setText(String.format("%s %s",c,math.bal));
                }
                else{
                    gl.setText("ОШИБКА!");
                    math.resho=math.resho+1;
                }
                gl.setTextSize(59);
                tv.setText(String.format("%s %s %s %s %S", i, a, i, b, ot));
                v1.setVisibility(View.GONE);
                v2.setVisibility(View.GONE);
                v3.setVisibility(View.GONE);
                v4.setVisibility(View.GONE);
                Intent i;
                i = new Intent(getApplicationContext(), proisvst.class);
                startActivity(i);
            }
        });
        int finalVa1 = va2;
        v2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (finalVa1 == i*i){
                    gl.setText("ВЕРНО!");
                    math.bal=math.bal+1;
                    tim.setText(String.format("%s %s",c,math.bal));
                }
                else{
                    gl.setText("ОШИБКА!");
                    math.resho=math.resho+1;
                }
                gl.setTextSize(59);
                tv.setText(String.format("%s %s %s %s %S", i, a, i, b, ot));
                v1.setVisibility(View.GONE);
                v2.setVisibility(View.GONE);
                v3.setVisibility(View.GONE);
                v4.setVisibility(View.GONE);
                Intent i;
                i = new Intent(getApplicationContext(), proisvst.class);
                startActivity(i);
            }
        });
        int finalVa2 = va3;
        v3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (finalVa2 == i*i){
                    gl.setText("ВЕРНО!");
                    math.bal=math.bal+1;
                    tim.setText(String.format("%s %s",c,math.bal));
                }
                else{
                    gl.setText("ОШИБКА!");
                    math.resho=math.resho+1;
                }
                gl.setTextSize(59);
                tv.setText(String.format("%s %s %s %s %S", i, a, i, b, ot));
                v1.setVisibility(View.GONE);
                v2.setVisibility(View.GONE);
                v3.setVisibility(View.GONE);
                v4.setVisibility(View.GONE);
                Intent i;
                i = new Intent(getApplicationContext(), proisvst.class);
                startActivity(i);
            }
        });
        int finalVa3 = va4;
        v4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (finalVa3 == i*i){
                    gl.setText("ВЕРНО!");
                    math.bal=math.bal+1;
                    tim.setText(String.format("%s %s",c,math.bal));
                }
                else{
                    gl.setText("ОШИБКА!");
                    math.resho=math.resho+1;
                }
                gl.setTextSize(59);
                tv.setText(String.format("%s %s %s %s %S", i, a, i, b, ot));
                v1.setVisibility(View.GONE);
                v2.setVisibility(View.GONE);
                v3.setVisibility(View.GONE);
                v4.setVisibility(View.GONE);
                Intent i;
                i = new Intent(getApplicationContext(), proisvst.class);
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
        if(math.time < 1) {
            Intent i;
            i = new Intent(getApplicationContext(), plusitog.class);
            startActivity(i);
        }
        this.chronometerCountDown.setText(String.format("%s %s",d,math.time));
        math.time--;
    }


}