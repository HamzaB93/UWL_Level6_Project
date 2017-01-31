package com.example.user.workout;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;


public class MainActivity extends Activity implements WorkoutListFragment.WorkoutListListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Retrieving details from the workout class to populate the detail fragment
        //WorkoutDetailFragment frag = (WorkoutDetailFragment)
        //        getSupportFragmentManager().findFragmentById(R.id.detail_frag);
        //frag.setWorkoutId(0);
    }

    @Override
    // Implementing the listener from listfragment
    public void itemClicked(long id) {
        WorkoutDetailFragment details = new WorkoutDetailFragment();
        // Replaces fragment at runtime
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        details.setWorkoutId(id);

        ft.replace(R.id.fragment_container, details);
        // Allows you to move backwards when navigating
        ft.addToBackStack(null);
        // Animation
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.commit();
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
