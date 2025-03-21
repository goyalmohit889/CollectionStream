package com.bridgelabz.collectionstream.generics.resumescreening;

public class AIResumeScreening {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> seResume = new Resume<>("Alice Johnson", new SoftwareEngineer());
        Resume<DataScientist> dsResume = new Resume<>("Bob Smith", new DataScientist());
        Resume<ProductManager> pmResume = new Resume<>("Charlie Brown", new ProductManager());

        ResumeScreeningSystem system = new ResumeScreeningSystem();
        system.addResume(seResume);
        system.addResume(dsResume);
        system.addResume(pmResume);

        System.out.println("\nAI-Driven Resume Screening System:");
        system.displayResumes();

        System.out.println("\nProcessing Resumes:");
        ResumeScreeningSystem.processResume(seResume);
        ResumeScreeningSystem.processResume(dsResume);
        ResumeScreeningSystem.processResume(pmResume);
    }
}
