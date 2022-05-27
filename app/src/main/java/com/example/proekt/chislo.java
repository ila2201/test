package com.example.proekt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class chislo extends AppCompatActivity {


    private Button buttonStart;
    private Chronometer chronometerCountDown;

    private int counter = 60;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chislo);

        this.chronometerCountDown = (Chronometer) findViewById(R.id.chronometerCountDown);
        this.buttonStart = (Button) findViewById(R.id.button_start);

        this.chronometerCountDown.setText(counter + "");

        this.buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doStart();
            }
        });

        // This listener will customize the chronometer text content.
        // It will show number from 10 to 0 repeatedly.
        this.chronometerCountDown.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
            @Override
            public void onChronometerTick(Chronometer chronometer) {
                onChronometerTickHandler();
            }
        });
    }


    private void onChronometerTickHandler()  {
        if(this.counter < 0) {
            this.counter = 10;
        }
        this.chronometerCountDown.setText(counter + "");
        this.counter--;
    }


    private void doStart()  {
        this.chronometerCountDown.start();
    }

}

