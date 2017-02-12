package com.example.user.nativeprojectapp;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ScrollView;

public class ScrollTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_test);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final ScrollView scroll = (ScrollView) findViewById(R.id.scrolltestview);
        scroll.post(new Runnable() {
            @Override
            public void run() {
                scroll.fullScroll(ScrollView.FOCUS_DOWN);
            }
        });

        ObjectAnimator animation = ObjectAnimator.ofInt(scroll, "scroll", scroll.getBottom());
        animation.setDuration(9000);
        animation.start();

    }
}
