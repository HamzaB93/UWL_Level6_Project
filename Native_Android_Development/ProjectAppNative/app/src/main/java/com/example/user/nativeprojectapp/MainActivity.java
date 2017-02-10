package com.example.user.nativeprojectapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // PUT LISTENER HERE
        AdapterView.OnItemClickListener clickListener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> listView, View v, int position, long id) {
                if(position == 0) {
                    Intent intent = new Intent (MainActivity.this, PreImageTestActivity.class);
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent (MainActivity.this, PreCycleTestActivity.class);
                    startActivity(intent);
                }
            }
        };
        // Referencing the list view and setting the listener above
        ListView listOptions = (ListView) findViewById(R.id.list_options);
        listOptions.setOnItemClickListener(clickListener);
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
