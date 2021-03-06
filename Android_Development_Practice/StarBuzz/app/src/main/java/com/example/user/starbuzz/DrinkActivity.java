package com.example.user.starbuzz;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkActivity extends AppCompatActivity {

    public static final String EXTRA_DRINKNO = "drinkNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        // Get drink from intent
        int drinkNo = (Integer)getIntent().getExtras().get(EXTRA_DRINKNO);
        // use the drink no to get the information about the drink you chose from the list
        Drink drink = Drink.drinks[drinkNo];

        // Populate the drink image
        ImageView photo = (ImageView) findViewById(R.id.photo);
        photo.setImageResource(drink.getImageResourceId());
        photo.setContentDescription(drink.getName());

        // Populate the drink name
        TextView name = (TextView) findViewById(R.id.name);
        name.setText(drink.getName());

        // Populate drink description
        TextView description = (TextView) findViewById(R.id.description);
        description.setText(drink.getDescription());
    }
}
