package com.bridgelabz.collectionstream.generics.universitycoursemgmt;

public class UniversityCourseSystem {
    public static void main(String[] args) {
        Course<ExamCourse> mathExam = new Course<>("Mathematics 101", new ExamCourse("Final Exam"));
        Course<AssignmentCourse> csAssignment = new Course<>("Computer Science 201", new AssignmentCourse("Weekly Assignments"));
        Course<ResearchCourse> aiResearch = new Course<>("Artificial Intelligence 301", new ResearchCourse("Thesis Paper"));

        CourseManager manager = new CourseManager();
        manager.addCourse(mathExam);
        manager.addCourse(csAssignment);
        manager.addCourse(aiResearch);

        System.out.println("University Course Catalog:");
        manager.displayCourses();
    }
}