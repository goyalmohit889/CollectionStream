package com.bridgelabz.collectionstream.generics.resumescreening;

import java.util.ArrayList;
import java.util.List;

class ResumeScreeningSystem {
    private List<Resume<? extends JobRole>> resumes = new ArrayList<>();

    public void addResume(Resume<? extends JobRole> resume) {
        resumes.add(resume);
    }

    public void displayResumes() {
        for (Resume<? extends JobRole> resume : resumes) {
            System.out.println(resume);
        }
    }

    // Generic method to process resumes
    public static <T extends JobRole> void processResume(Resume<T> resume) {
        System.out.println("Processing resume of " + resume.getCandidateName() + " for " + resume.getJobRole().getRoleName());
    }
}