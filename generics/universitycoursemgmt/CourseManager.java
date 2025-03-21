package com.bridgelabz.collectionstream.generics.universitycoursemgmt;

import java.util.ArrayList;
import java.util.List;

class CourseManager {
    private List<Course<? extends CourseType>> courses = new ArrayList<>();

    public void addCourse(Course<? extends CourseType> course) {
        courses.add(course);
    }

    public void displayCourses() {
        for (Course<? extends CourseType> course : courses) {
            System.out.println(course);
        }
    }
}
