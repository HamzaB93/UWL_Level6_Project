package com.example.user.mysecondapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
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

    private ModuleInfo info = new ModuleInfo();

    // Call when button is clicked
    public void onClickFindModule(View view) {
        // Get reference to TextView
        TextView description = (TextView) findViewById(R.id.textView);

        // Get reference to Spinner
        Spinner courseName = (Spinner) findViewById(R.id.spinner);

        // Get the selected item from the spinner
        String course = String.valueOf(courseName.getSelectedItem());

        // Display spinner item in textview
        //description.setText(course);

        // Get recomendation from the ModuleInfo Class - giving it string from spinner
        List<String> courseList = info.getCourses(course);

        StringBuilder typesFormatted = new StringBuilder();
        for(String brand : courseList) {
            typesFormatted.append(brand).append('\n');
        }

        // Display course info
        description.setText(typesFormatted);
    }
}
