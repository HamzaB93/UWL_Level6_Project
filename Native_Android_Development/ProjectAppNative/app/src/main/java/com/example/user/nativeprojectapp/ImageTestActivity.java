package com.example.user.nativeprojectapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import static com.example.user.nativeprojectapp.R.attr.logo;
import static com.example.user.nativeprojectapp.R.mipmap.ic_launcher;

public class ImageTestActivity extends AppCompatActivity {

    private int count = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_test);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        
        for (int i = 0; i < 3 ; i ++) {
            // Layout setup
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setOrientation(LinearLayout.VERTICAL);

            linearLayout.setLayoutParams(new Toolbar.LayoutParams(Toolbar.LayoutParams.MATCH_PARENT,
                    Toolbar.LayoutParams.MATCH_PARENT));

            // ImageView Setup
            ImageView imageView = new ImageView(this);

            // Setting image resource
            imageView.setImageResource(R.drawable.android_logo);

            // set position
            imageView.setLayoutParams(new Toolbar.LayoutParams(Toolbar.LayoutParams.MATCH_PARENT,
                    Toolbar.LayoutParams.MATCH_PARENT));

            // adding view to layout
            linearLayout.addView(imageView);
            // make visible to program
            setContentView(linearLayout);

            Handler handler = new Handler();

            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(ImageTestActivity.this, PreImageTestActivity.class);
                    startActivity(intent);
            }
            }, 3000);
        }
    }
}