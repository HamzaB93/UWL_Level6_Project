package com.example.user.nativeprojectapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class ImageTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_test);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void onClickImageTest(View view) {
        // Reference images
        ImageView and1 = (ImageView) findViewById(R.id.android_image);
        ImageView and2 = (ImageView) findViewById(R.id.android_image2);
        ImageView and3 = (ImageView) findViewById(R.id.android_image3);
        ImageView and4 = (ImageView) findViewById(R.id.android_image4);
        ImageView and5 = (ImageView) findViewById(R.id.android_image5);
        ImageView and6 = (ImageView) findViewById(R.id.android_image6);

        if (and1.getVisibility() == View.VISIBLE) {
            and1.setVisibility(View.INVISIBLE);
        }
        if (and2.getVisibility() == View.VISIBLE) {
            and2.setVisibility(View.INVISIBLE);
        }
        if (and3.getVisibility() == View.VISIBLE) {
            and3.setVisibility(View.INVISIBLE);
        }
        if (and4.getVisibility() == View.VISIBLE) {
            and4.setVisibility(View.INVISIBLE);
        }
        if (and5.getVisibility() == View.VISIBLE) {
            and5.setVisibility(View.INVISIBLE);
        }
        if (and6.getVisibility() == View.VISIBLE) {
            and6.setVisibility(View.INVISIBLE);
        }
    }

}