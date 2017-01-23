package com.example.user.workoutfragment;

public class Workout {
    private String name;
    private String description;

    public static final Workout[] workouts = {
            new Workout("The Limkb Losener", "5 pushups\n10 squats\n15 pullups"),
            new Workout("Core Agony", "100 pullups\n100 pushups\n100 situps\n100 squats"),
            new Workout("The Whimp Special", "5 pullups\n10 pushups\n15 squats"),
            new Workout("Strength and Length", "500m run\n21 x 1.5 kettleball swing\n21 pullups")
    };

    public Workout(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    @Override
    public String toString() {
        return this.name;
    }
}
