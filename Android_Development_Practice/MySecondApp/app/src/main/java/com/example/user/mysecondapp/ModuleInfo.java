package com.example.user.mysecondapp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 14/01/2017.
 */

public class ModuleInfo {

    List<String> getCourses(String type) {
        List<String> courses = new ArrayList<String>();
        if(type.equals("Computer Science")) {
            courses.add("A degree in Computer Science will...");
            courses.add("Modules: bla, bla, bla");
        } else if(type.equals("Creative Computing")) {
            courses.add("A degree in Creative Computing will...");
            courses.add("Modules: bla, bla");
        } else if (type.equals("Mobile Computing")) {
            courses.add("A degree in Mobile Computing will...");
            courses.add("Module: bla, bla");
        } else {
            courses.add("Course not found!");
        }
        return courses;
    }
}
