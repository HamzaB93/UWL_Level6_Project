package com.example.user.nativeprojectapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Cycle1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cycle1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Intent to be used in for loop
        final Intent intent = new Intent(Cycle1Activity.this, Cycle1Activity.class);

        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    startActivity(intent);
                    finish();

                }
            }
        },1000);


//
//        for (int i = 0 ; i < 2 ; i++) {
//            Intent intent = new Intent (Cycle1Activity.this, Cycle1Activity.class);
//            startActivity(intent);
//        }
    }

}
