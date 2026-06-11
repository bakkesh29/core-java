package com.xworkz.javapractice.interfacefiles;

public interface Hospital {

    int getBedCount();
    double getTreatmentCost();
    boolean isEmergencyAvailable();
    long getPatientCount();
    char getBlock();

    Doctor getDoctor();
    Patient getPatient();
    HospitalStatus getStatus();
    MedicalService getMedicalService();

    int[] getWardNumbers();
    double[] getBills();

    Doctor[] getDoctors();
    Patient[] getPatients();

    void admitPatient();
    void dischargePatient();
}
