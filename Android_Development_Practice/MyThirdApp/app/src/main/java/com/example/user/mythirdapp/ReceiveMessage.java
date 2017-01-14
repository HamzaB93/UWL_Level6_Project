package com.example.user.mythirdapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class ReceiveMessage extends AppCompatActivity {

    // Used for our intent.putExtra  function target  variable
    public static final String EXTRA_MESSAGE = "Something";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Get the intent
        Intent intent = getIntent();

        // Retreive the message from the intent using getStringExtra
        String messageText = intent.getStringExtra(EXTRA_MESSAGE);

        // get reference to TExtView
        TextView messageView = (TextView) findViewById(R.id.message);

        // set the text
        messageView.setText(messageText);

    }

}
