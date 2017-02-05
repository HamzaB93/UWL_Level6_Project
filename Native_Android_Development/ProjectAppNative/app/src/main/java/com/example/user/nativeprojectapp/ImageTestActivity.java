package com.example.user.nativeprojectapp;

import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class ImageTestActivity extends AppCompatActivity {

    private int count = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_test);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void onClickImageTest(View view) {
        // Reference images
        final ImageView and1 = (ImageView) findViewById(R.id.android_image);
        final ImageView and2 = (ImageView) findViewById(R.id.android_image2);
        final ImageView and3 = (ImageView) findViewById(R.id.android_image3);
        final ImageView and4 = (ImageView) findViewById(R.id.android_image4);
        final ImageView and5 = (ImageView) findViewById(R.id.android_image5);
        final ImageView and6 = (ImageView) findViewById(R.id.android_image6);

        final Handler handler = new Handler();

        makeImageInvisible(and1, and2, and3, and4, and5, and6);
        handler.postDelayed(new Runnable() {
        @Override
        public void run() {
            makeImageVisible(and1, and2, and3, and4, and5, and6);
        }
        }, 1000);
    }

    public void makeImageInvisible(ImageView and1, ImageView and2, ImageView and3, ImageView and4,
                                 ImageView and5,ImageView and6) {
        and1.setVisibility(View.INVISIBLE);
        and2.setVisibility(View.INVISIBLE);
        and3.setVisibility(View.INVISIBLE);
        and4.setVisibility(View.INVISIBLE);
        and5.setVisibility(View.INVISIBLE);
        and6.setVisibility(View.INVISIBLE);
    }

    public void makeImageVisible(ImageView and1, ImageView and2, ImageView and3, ImageView and4,
                                   ImageView and5,ImageView and6) {
        and1.setVisibility(View.VISIBLE);
        and2.setVisibility(View.VISIBLE);
        and3.setVisibility(View.VISIBLE);
        and4.setVisibility(View.VISIBLE);
        and5.setVisibility(View.VISIBLE);
        and6.setVisibility(View.VISIBLE);
    }
}