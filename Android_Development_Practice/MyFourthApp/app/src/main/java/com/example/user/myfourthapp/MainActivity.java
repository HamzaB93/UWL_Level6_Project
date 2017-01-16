package com.example.user.myfourthapp;

import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Record the number of seconds passed and whether the stopwatch is running
    private int seconds = 0;
    private boolean running;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Start the runTimer() method when the activity is created
        runTimer();
    }

    public void onClickStart(View view) {
        // The stopwatch will run
        running = true;
    }

    public void onClickStop(View view) {
        // The stopwatch will stop
        running = false;
    }

    public void onClickReset (View view) {
        // Reset all
        running = false;
        seconds = 0;
    }

    public void runTimer() {
        // Get reference to the textView timeView
        final TextView timeView = (TextView) findViewById(R.id.time_view);

        // Define new handler, use this class to schedule cod that will be run in the future
        final Handler handler = new Handler();

        // post() accepts on paramter, object Runnable (job you want to run)
        // Runnable objects defines a run() function
        handler.post(new Runnable() {
            @Override
            public void run() {

                int hours = seconds / 3600;
                int minutes = (seconds % 3600) / 60;
                int secs = seconds % 60;

                String time = String.format("%d:%02d:%02d", hours, minutes, secs);
                timeView.setText(time);

                if (running) {
                    seconds++;
                }
                // postDelayed() takes Runnable and Long
                // Runnable is the code you want to run, Long is number of milliseconds you want
                // to delay
                handler.postDelayed(this, 1000);
            }
        });
    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
