package com.xworkz.javapractice.interfacefiles;

public interface PG {

    int getRoomCount();
    double getRent();
    boolean isAvailable();
    long getResidents();
    char getWing();

    Room getRoom();
    Tenant getTenant();
    PGStatus getStatus();
    Accommodation getAccommodation();

    int[] getRoomNumbers();
    double[] getMonthlyIncome();

    Room[] getRooms();
    Tenant[] getTenants();

    void allocateRoom();
    void vacateRoom();
}