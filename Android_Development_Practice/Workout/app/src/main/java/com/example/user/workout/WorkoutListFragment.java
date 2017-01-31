package com.example.user.workout;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class WorkoutListFragment extends ListFragment {


    public WorkoutListFragment() {
        // Required empty public constructor
    }

    // Waiting for clicks
    static interface WorkoutListListener {
        void itemClicked(long id);
    };
    private WorkoutListListener listener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Populating the list fragment with the array of objects from Workout
        String[] names = new String[Workout.workouts.length];
        for (int i = 0; i < names.length; i++) {
            names[i] = Workout.workouts[i].getName();
        }

        // Use array adpater to plug the names into the listview
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                inflater.getContext(),android.R.layout.simple_list_item_1, names);
        setListAdapter(adapter);

        return super.onCreateView(inflater, container, savedInstanceState);
    }

    // Gets called when fragment gets attached to an activity
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.listener = (WorkoutListListener)activity;
    }

    // tells listener when item is clicked
    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        if (listener != null) {
            listener.itemClicked(id);
        }
    }
}
