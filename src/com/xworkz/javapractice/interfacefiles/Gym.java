package com.xworkz.javapractice.interfacefiles;

public interface Gym {

    int getMemberCount();
    double getFee();
    boolean isOpen();
    long getEquipmentCount();
    char getSection();

    Trainer getTrainer();
    Member getMember();
    GymStatus getStatus();
    FitnessCenter getFitnessCenter();

    int[] getLockerNumbers();
    double[] getWeights();

    Trainer[] getTrainers();
    Member[] getMembers();

    void startWorkout();
    void endWorkout();
}