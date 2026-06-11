package com.xworkz.javapractice.interfacefiles;

public interface Institute {

    int getStudentCount();
    double getFees();
    boolean isRecognized();
    long getStaffCount();
    char getGrade();

    Student getStudent();
    Faculty getFaculty();
    InstituteStatus getStatus();
    Education getEducation();

    int[] getRollNumbers();
    double[] getMarks();

    Student[] getStudents();
    Faculty[] getFaculties();

    void conductClass();
    void conductExam();
}