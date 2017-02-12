package com.example.user.nativeprojectapp;


import android.hardware.Camera;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.security.Policy;

public class FlashTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash_test);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Camera camera = Camera.open();
        Camera.Parameters param = camera.getParameters();
        param.setFlashMode(Camera.Parameters.FLASH_MODE_TORCH);
        camera.setParameters(param);
        camera.startPreview();

    }

}
