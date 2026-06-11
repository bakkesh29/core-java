package com.xworkz.javapractice.interfacefiles;

public interface SDK {

    int getVersion();
    double getSize();
    boolean isSupported();
    long getDownloads();
    char getCategory();

    Software getSoftware();
    Library getLibrary();
    SDKStatus getStatus();
    Framework getFramework();

    int[] getBuildNumbers();
    double[] getRatings();

    Software[] getSoftwares();
    Library[] getLibraries();

    void installSDK();
    void updateSDK();
}