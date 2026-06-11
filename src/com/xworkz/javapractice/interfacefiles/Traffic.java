package com.xworkz.javapractice.interfacefiles;

public interface Traffic {

    int getVehicleCount();
    double getSpeedLimit();
    boolean isSignalActive();
    long getFineAmount();
    char getZoneCode();

    Vehicle getVehicle();
    Signal getSignal();
    TrafficStatus getStatus();
    Road getRoad();

    int[] getLaneNumbers();
    double[] getSpeedRecords();

    Vehicle[] getVehicles();
    Signal[] getSignals();

    void controlTraffic();
    void stopTraffic();
}