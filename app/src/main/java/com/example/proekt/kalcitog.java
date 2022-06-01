package com.example.proekt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class kalcitog extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalcitog);
        Button exit = (Button) findViewById(R.id.exit);
        TextView itog = (TextView) findViewById(R.id.prim);
        itog.setText(String.format("%s", Matematika.bal));
        Matematika.bal=0;
        Matematika.time=60;
        Matematika.resho=0;
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i;
                i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }

}