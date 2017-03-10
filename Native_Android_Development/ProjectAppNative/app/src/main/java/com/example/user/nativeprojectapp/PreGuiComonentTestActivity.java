package com.example.user.nativeprojectapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class PreGuiComonentTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_gui_comonent_test);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }


    public void onClickGuiComponentTestStart(View v){
        Intent intent = new Intent(PreGuiComonentTestActivity.this, GuiComonentTestActivity.class);
        startActivity(intent);
    }
}
