package com.example.SignLanguageDetection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class SplashScrren extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_scrren);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // Remove this line as it's unnecessary.
        // setContentView(R.layout.activity_main);

        // on below line we are calling handler to run a task
        // for a specific time interval
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // on the below line we are
                // creating a new intent
                Intent i = new Intent(SplashScrren.this, MainActivity.class);

                // on the below line we are
                // starting a new activity.
                startActivity(i);

                // on the below line we are finishing
                // our current activity.
                finish();
            }
        }, 5000);
    }
}