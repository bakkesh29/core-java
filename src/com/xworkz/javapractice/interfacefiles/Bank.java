package com.xworkz.javapractice.interfacefiles;

public interface Bank {

    int getBranchCount();
    double getInterestRate();
    boolean isOnlineBankingAvailable();
    long getCustomerCount();
    char getZone();

    Account getAccount();
    Transaction getTransaction();
    BankStatus getStatus();
    FinancialService getFinancialService();

    int[] getAccountNumbers();
    double[] getBalances();

    Account[] getAccounts();
    Transaction[] getTransactions();

    void deposit();
    void withdraw();
}