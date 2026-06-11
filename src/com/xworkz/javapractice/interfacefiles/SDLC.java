package com.xworkz.javapractice.interfacefiles;

public interface SDLC {

    int getProjectId();
    double getBudget();
    boolean isCompleted();

    Project getProject();
    Team getTeam();
    Status getStatus();
    Development getDevelopment();

    int[] getMilestones();
    double[] getCosts();

    Project[] getProjects();
    Team[] getTeams();

    void startProject();
    void deployProject();

    char getGrade();
    long getDuration();
}