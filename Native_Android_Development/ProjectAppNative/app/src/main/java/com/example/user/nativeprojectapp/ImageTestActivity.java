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




//    public void onClickImageTest(View view) {
//        // Reference images
//        final ImageView and1 = (ImageView) findViewById(R.id.android_image);
//        final ImageView and2 = (ImageView) findViewById(R.id.android_image2);
//        final ImageView and3 = (ImageView) findViewById(R.id.android_image3);
//        final ImageView and4 = (ImageView) findViewById(R.id.android_image4);
//        final ImageView and5 = (ImageView) findViewById(R.id.android_image5);
//        final ImageView and6 = (ImageView) findViewById(R.id.android_image6);
//
//        final Handler handler = new Handler();
//
//        makeImageInvisible(and1, and2, and3, and4, and5, and6);
//        handler.postDelayed(new Runnable() {
//        @Override
//        public void run() {
//            makeImageVisible(and1, and2, and3, and4, and5, and6);
//        }
//        }, 1000);
//    }
//
//    public void makeImageInvisible(ImageView and1, ImageView and2, ImageView and3, ImageView and4,
//                                 ImageView and5,ImageView and6) {
//        and1.setVisibility(View.INVISIBLE);
//        and2.setVisibility(View.INVISIBLE);
//        and3.setVisibility(View.INVISIBLE);
//        and4.setVisibility(View.INVISIBLE);
//        and5.setVisibility(View.INVISIBLE);
//        and6.setVisibility(View.INVISIBLE);
//    }
//
//    public void makeImageVisible(ImageView and1, ImageView and2, ImageView and3, ImageView and4,
//                                   ImageView and5,ImageView and6) {
//        and1.setVisibility(View.VISIBLE);
//        and2.setVisibility(View.VISIBLE);
//        and3.setVisibility(View.VISIBLE);
//        and4.setVisibility(View.VISIBLE);
//        and5.setVisibility(View.VISIBLE);
//        and6.setVisibility(View.VISIBLE);
//    }
}