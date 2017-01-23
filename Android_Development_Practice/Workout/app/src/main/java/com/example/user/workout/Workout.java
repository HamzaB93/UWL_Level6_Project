package com.example.user.workout;

public class Workout {
    private String name;
    private String description;

    public static final Workout[] workouts = {
            new Workout("The limb losener", "Losen\nThose\nLimbs"),
            new Workout("Core Agony", "This\nIs\nGoing\nTo\nBe\nAgony"),
            new Workout("The Whimp Special", "For\nThe\nScrubs"),
            new Workout("Strength and Length", "Run\nJump\nEtc")
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
