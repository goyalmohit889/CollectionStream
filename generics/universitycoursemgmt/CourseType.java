package com.bridgelabz.collectionstream.generics.universitycoursemgmt;

abstract class CourseType {
    private String name;

    public CourseType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " - " + name;
    }
}