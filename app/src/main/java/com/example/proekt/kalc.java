package com.example.proekt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;

import java.util.Random;

public class kalc extends AppCompatActivity {
    String a = "Ходов: ";
    String b = "Цель: ";
    String c = "Решено: ";
    int o = 0;
    int ho = 0;
    int q1 =0;
    int q2 = 0;
    int q3 = 0;
    int q4 = 0;
    String vc1 = "";
    String vc2 = "";
    String vc3 = "";
    String vc4 = "";

    //1 - +; 2 - -; 3 - *; 4 - /;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalc);
        Random r = new Random();
        int d = r.nextInt(4)+2;
        ho = r.nextInt(5)+2;
        int ot = r.nextInt(100)-50;
        o = ot;
        int h = ho;
        int c1 = r.nextInt(4)+1;
        int c2 = r.nextInt(4)+1;
        int c3 = r.nextInt(4)+1;
        int c4 = r.nextInt(4)+1;
        TextView hod = (TextView) findViewById(R.id.hod);
        TextView chel = (TextView) findViewById(R.id.chel);
        TextView tek = (TextView) findViewById(R.id.prim);
        Button v1 = (Button) findViewById(R.id.v1);
        Button v2 = (Button) findViewById(R.id.v2);
        Button v3 = (Button) findViewById(R.id.v3);
        Button v4 = (Button) findViewById(R.id.v4);
        q1 = r.nextInt(9)+1;
        q2 = r.nextInt(9)+1;
        q3 = r.nextInt(9)+1;
        q4 = r.nextInt(9)+1;
        int e = 0;
        while (h>0){
            if (d==2){
                e = r.nextInt(2)+1;
            }
            if (d==3){
                e = r.nextInt(3)+1;
            }
            if (d==4){
                e = r.nextInt(4)+1;
            }
            if (c1 == 1 && e ==1){
                o=o-q1;
            }
            if (c1 == 2 && e ==1){
                o=o+q1;
            }
            if (c1 == 3 && e ==1){
                o=o/q1;
            }
            if (c1 == 4 && e ==1){
                o=o*q1;
            }
            if (c2 == 1 && e ==2){
                o=o-q2;
            }
            if (c2 == 2 && e ==2){
                o=o+q2;
            }
            if (c2 == 3 && e ==2){
                o=o/q2;
            }
            if (c2 == 4 && e ==2){
                o=o*q2;
            }
            if (c3 == 1 && e ==3){
                o=o-q3;
            }
            if (c3 == 2 && e ==3){
                o=o+q3;
            }
            if (c3 == 3 && e ==3){
                o=o/q3;
            }
            if (c3 == 4 && e ==3){
                o=o*q3;
            }
            if (c4 == 1 && e ==4){
                o=o-q4;
            }
            if (c4 == 2 && e ==4){
                o=o+q4;
            }
            if (c4 == 3 && e ==4){
                o=o/q4;
            }
            if (c4 == 4 && e ==4){
                o=o*q4;
            }
            h-=1;
        }
        if (math.check == 0){
            math.check = 1;
            math.z = o;
            math.chel = ot;
            math.hod = ho;
            math.d = d;
            if (d == 2){
                math.b1 = q1;
                math.b2 = q2;
                math.z1 = c1;
                math.z2 = c2;
            }
            if (d == 3){
                math.b1 = q1;
                math.b2 = q2;
                math.b3 = q3;
                math.z1 = c1;
                math.z2 = c2;
                math.z3 = c3;
            }
            if (d == 4){
                math.b1 = q1;
                math.b2 = q2;
                math.b3 = q3;
                math.b4 = q4;
                math.z1 = c1;
                math.z2 = c2;
                math.z3 = c3;
                math.z4 = c4;
            }
        }
        if (math.check == 1){
            math.check = 0;
            math.z = o;
            math.chel = ot;
            math.hod = ho;
            math.d=d;
            if (d == 2){
                q1 = math.b1;
                q2 = math.b2;
                c1 = math.z1;
                c2 = math.z2;
            }
            if (d == 3){
                q1 = math.b1;
                q2 = math.b2;
                q3 = math.b3;
                c1 = math.z1;
                c2 = math.z2;
                c3 = math.z3;
            }
            if (d == 4){
                q1 = math.b1;
                q2 = math.b2;
                q3 = math.b3;
                q4 = math.b4;
                c1 = math.z1;
                c2 = math.z2;
                c3 = math.z3;
                c4 = math.z4;
            }
        }
        if (c1 == 1){vc1="+";}if (c1 == 2){vc1="-";}if (c1 == 3){vc1="*";}if (c1 == 1){vc1="/";}
        if (c2 == 1){vc2="+";}if (c2 == 2){vc2="-";}if (c2 == 3){vc2="*";}if (c2 == 1){vc2="/";}
        if (c3 == 1){vc3="+";}if (c3 == 2){vc3="-";}if (c3 == 3){vc3="*";}if (c3 == 1){vc3="/";}
        if (c4 == 1){vc4="+";}if (c4 == 2){vc4="-";}if (c4 == 3){vc4="*";}if (c4 == 1){vc4="/";}
        if (d == 2){
            v1.setText(String.format("%s %s",vc1,q1));
            v2.setText(String.format("%s %s",vc2,q2));
            v3.setVisibility(View.GONE);
            v4.setVisibility(View.GONE);
        }
        if (d == 3){
            v1.setText(String.format("%s %s",vc1,q1));
            v2.setText(String.format("%s %s",vc2,q2));
            v3.setText(String.format("%s %s",vc3,q3));
            v4.setVisibility(View.GONE);
        }
        if (d == 4){
            v1.setText(String.format("%s %s",vc1,q1));
            v2.setText(String.format("%s %s",vc2,q2));
            v3.setText(String.format("%s %s",vc3,q3));
            v4.setText(String.format("%s %s",vc4,q4));
        }
        hod.setText(String.format("%s %s", a, ho));
        chel.setText(String.format("%s %s", b, ot));
        tek.setText(String.format("%s",o));
        int c11 = c1;
        int c22 = c2;
        int c33 = c3;
        int c44 = c4;
        v1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c11 == 1){
                    o=o+q1;
                }
                if (c11 == 2){
                    o=o-q1;
                }
                if (c11 == 3){
                    o=o*q1;
                }
                if (c11 == 4){
                    o=o/q1;
                }
                ho= ho - 1;
            }
        });
        v2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c22 == 1){
                    o=o+q2;
                }
                if (c22 == 2){
                    o=o-q2;
                }
                if (c22 == 3){
                    o=o*q2;
                }
                if (c22 == 4){
                    o=o/q2;
                }
                ho= ho - 1;
            }
        });
        v3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c33 == 1){
                    o=o+q3;
                }
                if (c33 == 2){
                    o=o-q3;
                }
                if (c33 == 3){
                    o=o*q3;
                }
                if (c33 == 4){
                    o=o/q3;
                }
                ho= ho - 1;
            }
        });
        v4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c44 == 1){
                    o=o+q4;
                }
                if (c44 == 2){
                    o=o-q4;
                }
                if (c44 == 3){
                    o=o*q4;
                }
                if (c44 == 4){
                    o=o/q4;
                }
                ho= ho - 1;
            }
        });
        hod.setText(String.format("%s %s", a, ho));
        chel.setText(String.format("%s %s", b, ot));
        tek.setText(String.format("%s",o));

    }
}