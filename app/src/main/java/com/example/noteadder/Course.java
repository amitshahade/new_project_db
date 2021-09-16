package com.example.noteadder;

import java.util.ArrayList;
import java.util.Random;

public class Course
{
    private String name, instructor;
    private int batchStrength;

    public Course(String name, String instructor, int batchStrength) {
        this.name = name;
        this.instructor = instructor;
        this.batchStrength = batchStrength;
    }



    public String getName() {
        return name;
    }

    public String getInstructor() {
        return instructor;
    }

    public int getBatchStrength() {
        return batchStrength;
    }

    public static final String[] teachers = {
            "Harshit", "Arnav", "Prateek", "Aayush", "Deepak", "Garima"
    };
    public static final String[] courseNames = {
            "Launchpad", "Crux", "Android", "NodeJS", "Python", "AngularJS"
    };

    public static ArrayList<Course> generateNRandomCourses (int n) {
        ArrayList<Course> courses = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            com.example.recycle_view.Course course = new com.example.recycle_view.Course(
                    teachers[r.nextInt(6)],
                    courseNames[r.nextInt(6)],
                    10 + r.nextInt(10)

            );
            courses.add(course);
        }
        return courses;
    }
}
