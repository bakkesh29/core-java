package com.xworkz.javapractice.interfacefiles;
public interface Mall {

    int getFloorCount();
    double getRevenue();
    boolean isOpen();
    long getVisitors();
    char getBlock();

    Shop getShop();
    Customer getCustomer();
    MallStatus getStatus();
    Security getSecurity();

    int[] getParkingSlots();
    double[] getSales();

    Shop[] getShops();
    Customer[] getCustomers();

    void openMall();
    void closeMall();
}