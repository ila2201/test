package com.example.proekt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;

import java.util.Random;

public class dels extends AppCompatActivity {
    String a = " / ";
    String b = " = ";
    String c = "Решено: ";
    String d = "Время: ";
    private Chronometer chronometerCountDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plus);
        TextView gla = (TextView) findViewById(R.id.glav);
        gla.setText("Деление");
        this.chronometerCountDown = (Chronometer) findViewById(R.id.time);
        Random r = new Random();
        this.chronometerCountDown.start();
        int i = r.nextInt(90)+10;
        int i1 = r.nextInt(90) +10;
        int i2 = i*i1;
        int ot = i2/i1;
        TextView tv = (TextView) findViewById(R.id.prim);
        TextView tim = (TextView) findViewById(R.id.bal);
        tv.setText(String.format("%s %s %s", i2, a, i1));
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
            va1=i2/i1;
            va2=i2/i1+55;
            va3=i2/i1-80;
            va4=i2/i1+26;
        }
        if (k == 2){
            va1=i2/i1-1;
            va2=i2/i1;
            va3=i2/i1+23;
            va4=i2/i1-70;
        }
        if (k == 3){
            va1=i2/i1+34;
            va2=i2/i1-90;
            va3=i2/i1;
            va4=i2/i1+55;
        }
        if (k == 4){
            va1=i2/i1+34;
            va2=i2/i1+52;
            va3=i2/i1-80;
            va4=i2/i1;
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
                if (finalVa == i2/i1){
                    gl.setText("ВЕРНО!");
                    math.bal=math.bal+1;
                    tim.setText(String.format("%s %s",c,math.bal));
                }
                else{
                    gl.setText("ОШИБКА!");
                    math.resho=math.resho+1;
                }
                gl.setTextSize(59);
                tv.setText(String.format("%s %s %s %s %S", i2, a, i1, b, ot));
                v1.setVisibility(View.GONE);
                v2.setVisibility(View.GONE);
                v3.setVisibility(View.GONE);
                v4.setVisibility(View.GONE);
                Intent i;
                i = new Intent(getApplicationContext(), dels.class);
                startActivity(i);
            }
        });
        int finalVa1 = va2;
        v2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (finalVa1 == i2/i1){
                    gl.setText("ВЕРНО!");
                    math.bal=math.bal+1;
                    tim.setText(String.format("%s %s",c,math.bal));
                }
                else{
                    gl.setText("ОШИБКА!");
                    math.resho=math.resho+1;
                }
                gl.setTextSize(59);
                tv.setText(String.format("%s %s %s %s %S", i2, a, i1, b, ot));
                v1.setVisibility(View.GONE);
                v2.setVisibility(View.GONE);
                v3.setVisibility(View.GONE);
                v4.setVisibility(View.GONE);
                Intent i;
                i = new Intent(getApplicationContext(), dels.class);
                startActivity(i);
            }
        });
        int finalVa2 = va3;
        v3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (finalVa2 == i2/i1){
                    gl.setText("ВЕРНО!");
                    math.bal=math.bal+1;
                    tim.setText(String.format("%s %s",c,math.bal));
                }
                else{
                    gl.setText("ОШИБКА!");
                    math.resho=math.resho+1;
                }
                gl.setTextSize(59);
                tv.setText(String.format("%s %s %s %s %S", i2, a, i1, b, ot));
                v1.setVisibility(View.GONE);
                v2.setVisibility(View.GONE);
                v3.setVisibility(View.GONE);
                v4.setVisibility(View.GONE);
                Intent i;
                i = new Intent(getApplicationContext(), dels.class);
                startActivity(i);
            }
        });
        int finalVa3 = va4;
        v4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (finalVa3 == i2/i1){
                    gl.setText("ВЕРНО!");
                    math.bal=math.bal+1;
                    tim.setText(String.format("%s %s",c,math.bal));
                }
                else{
                    gl.setText("ОШИБКА!");
                    math.resho=math.resho+1;
                }
                gl.setTextSize(59);
                tv.setText(String.format("%s %s %s %s %S", i2, a, i1, b, ot));
                v1.setVisibility(View.GONE);
                v2.setVisibility(View.GONE);
                v3.setVisibility(View.GONE);
                v4.setVisibility(View.GONE);
                Intent i;
                i = new Intent(getApplicationContext(), dels.class);
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