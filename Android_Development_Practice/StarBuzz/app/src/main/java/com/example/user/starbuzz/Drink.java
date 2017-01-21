package com.example.user.starbuzz;

public class Drink {

    private String name;
    private String description;
    private int imageResourceId;

    // drinks is an array of Drink objects
    public static final Drink[] drinks = {
            new Drink ("Latte", "Espresso shots and milk", R.drawable.latte),
            new Drink ("Cappuccino", "Loads of milk", R.drawable.cappuccino),
            new Drink ("Filter", "Roasted coffee", R.drawable.filter)
    };

    // Constructor for Drink objects, have name descirption and imageResource id
    public Drink(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    // Get details
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public int getImageResourceId() {
        return imageResourceId;
    }
    public String toString() {
        return this.name;
    }
}
