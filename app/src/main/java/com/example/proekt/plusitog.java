package com.example.proekt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class plusitog extends AppCompatActivity {
    String a = "Процент: ";
    Double q = Double.valueOf(Matematika.bal);
    Double w = Double.valueOf(Matematika.resho);
    Double c = q/(w+q)*100;
    String z = "%";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plusitog);
        Button exit = (Button) findViewById(R.id.exit);
        TextView itog = (TextView) findViewById(R.id.prim);
        TextView osh = (TextView) findViewById(R.id.oshibki);
        TextView per = (TextView) findViewById(R.id.per);
        itog.setText(String.format("%s", Matematika.bal));
        osh.setText(String.format("%s", Matematika.resho));
        per.setText(String.format("%s %.0f %s",a, c,z));
        Matematika.bal=0;
        Matematika.time=60;
        Matematika.resho=0;
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i;
                i = new Intent(getApplicationContext(), Matematika.class);
                startActivity(i);
            }
        });
    }

}