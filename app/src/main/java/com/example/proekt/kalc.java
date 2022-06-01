package com.example.proekt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.sql.DataTruncation;
import java.util.Random;

public class kalc extends AppCompatActivity {
    String a = "Ходов: ";
    String ba = "Цель: ";
    String c = "Решено: ";
    String v = "Победа!";
    String za = "Попробуйте ещё раз";
    int o = 0;
    int ho = 0;
    int d = 0;
    int q1 =0;
    int q2 = 0;
    int q3 = 0;
    int q4 = 0;
    int ot = 0;
    int c1 =0;
    int c2 =0;
    int c3 =0;
    int c4 =0;
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
        d = r.nextInt(4)+2;
        ho = r.nextInt(3)+2;
        ot = r.nextInt(100)-50;
        o = ot;
        int h = ho;
        c1 = r.nextInt(4)+1;
        c2 = r.nextInt(4)+1;
        c3 = r.nextInt(4)+1;
        c4 = r.nextInt(4)+1;
        TextView hod = (TextView) findViewById(R.id.hod);
        TextView chel = (TextView) findViewById(R.id.chel);
        TextView tek = (TextView) findViewById(R.id.prim);
        TextView b = (TextView) findViewById(R.id.bal);
        b.setText(String.format("%s %s",c,math.bal));
        Button v1 = (Button) findViewById(R.id.v1);
        Button v2 = (Button) findViewById(R.id.v2);
        Button v3 = (Button) findViewById(R.id.v3);
        Button v4 = (Button) findViewById(R.id.v4);
        Button re = (Button) findViewById(R.id.rest);
        Button pe = (Button) findViewById(R.id.pop);
        pe.setVisibility(View.GONE);
        re.setVisibility(View.GONE);
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
        if (o==0){
            Intent i;
            i = new Intent(getApplicationContext(), kalc.class);
            startActivity(i);
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
            o = math.z;
            ot = math.chel;
            ho = math.hod;
            d=math.d;
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
        if (c1 == 1){vc1="+";}if (c1 == 2){vc1="-";}if (c1 == 3){vc1="*";}if (c1 == 4){vc1="/";}
        if (c2 == 1){vc2="+";}if (c2 == 2){vc2="-";}if (c2 == 3){vc2="*";}if (c2 == 4){vc2="/";}
        if (c3 == 1){vc3="+";}if (c3 == 2){vc3="-";}if (c3 == 3){vc3="*";}if (c3 == 4){vc3="/";}
        if (c4 == 1){vc4="+";}if (c4 == 2){vc4="-";}if (c4 == 3){vc4="*";}if (c4 == 4){vc4="/";}
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
        chel.setText(String.format("%s %s", ba, ot));
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
                hod.setText(String.format("%s %s", a, ho));
                tek.setText(String.format("%s",o));
                if (o==ot){
                    hod.setText(String.format("%s", v));
                    math.check=0;
                    math.bal=math.bal+1;
                    v1.setVisibility(View.GONE);
                    v2.setVisibility(View.GONE);
                    v3.setVisibility(View.GONE);
                    v4.setVisibility(View.GONE);
                    re.setVisibility(View.VISIBLE);
                    b.setText(String.format("%s %s",c,math.bal));
                }
                if (ho<1  && o!=ot){
                    pe.setVisibility(View.VISIBLE);
                    v1.setVisibility(View.GONE);
                    v2.setVisibility(View.GONE);
                    v3.setVisibility(View.GONE);
                    v4.setVisibility(View.GONE);
                    hod.setText(String.format("%s", za));

                }
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
                hod.setText(String.format("%s %s", a, ho));
                tek.setText(String.format("%s",o));
                if (o==ot){
                    hod.setText(String.format("%s", v));
                    math.check = 0;
                    math.bal=math.bal+1;
                    v1.setVisibility(View.GONE);
                    v2.setVisibility(View.GONE);
                    v3.setVisibility(View.GONE);
                    v4.setVisibility(View.GONE);
                    re.setVisibility(View.VISIBLE);
                    b.setText(String.format("%s %s",c,math.bal));
                }
                if (ho<1  && o!=ot){
                    pe.setVisibility(View.VISIBLE);
                    v1.setVisibility(View.GONE);
                    v2.setVisibility(View.GONE);
                    v3.setVisibility(View.GONE);
                    v4.setVisibility(View.GONE);
                    hod.setText(String.format("%s", za));

                }
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
                hod.setText(String.format("%s %s", a, ho));
                tek.setText(String.format("%s",o));
                if (o==ot){
                    hod.setText(String.format("%s", v));
                    math.check=0;
                    math.bal=math.bal+1;
                    v1.setVisibility(View.GONE);
                    v2.setVisibility(View.GONE);
                    v3.setVisibility(View.GONE);
                    v4.setVisibility(View.GONE);
                    re.setVisibility(View.VISIBLE);
                    b.setText(String.format("%s %s",c,math.bal));
                }
                if (ho<1  && o!=ot){
                    pe.setVisibility(View.VISIBLE);
                    v1.setVisibility(View.GONE);
                    v2.setVisibility(View.GONE);
                    v3.setVisibility(View.GONE);
                    v4.setVisibility(View.GONE);
                    hod.setText(String.format("%s", za));

                }
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
                hod.setText(String.format("%s %s", a, ho));
                tek.setText(String.format("%s",o));
                if (o==ot){
                    hod.setText(String.format("%s", v));
                    math.check=0;
                    math.bal=math.bal+1;
                    v1.setVisibility(View.GONE);
                    v2.setVisibility(View.GONE);
                    v3.setVisibility(View.GONE);
                    v4.setVisibility(View.GONE);
                    re.setVisibility(View.VISIBLE);
                    b.setText(String.format("%s %s",c,math.bal));
                }
                if (ho<1 && o!=ot){
                    pe.setVisibility(View.VISIBLE);
                    v1.setVisibility(View.GONE);
                    v2.setVisibility(View.GONE);
                    v3.setVisibility(View.GONE);
                    v4.setVisibility(View.GONE);
                    hod.setText(String.format("%s", za));
                }
            }
        });
        re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i;
                i = new Intent(getApplicationContext(), kalc.class);
                startActivity(i);
            }
        });

        pe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                o = math.z;
                ot = math.chel;
                ho = math.hod;
                d=math.d;
                pe.setVisibility(View.GONE);
                if (d == 2){
                    q1 = math.b1;
                    q2 = math.b2;
                    c1 = math.z1;
                    c2 = math.z2;
                    v1.setVisibility(View.VISIBLE);
                    v2.setVisibility(View.VISIBLE);
                }
                if (d == 3){
                    q1 = math.b1;
                    q2 = math.b2;
                    q3 = math.b3;
                    c1 = math.z1;
                    c2 = math.z2;
                    c3 = math.z3;
                    v1.setVisibility(View.VISIBLE);
                    v2.setVisibility(View.VISIBLE);
                    v3.setVisibility(View.VISIBLE);
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
                    v1.setVisibility(View.VISIBLE);
                    v2.setVisibility(View.VISIBLE);
                    v3.setVisibility(View.VISIBLE);
                    v4.setVisibility(View.VISIBLE);
                }
                hod.setText(String.format("%s %s", a, ho));
                tek.setText(String.format("%s",o));

            }
        });

    }
}