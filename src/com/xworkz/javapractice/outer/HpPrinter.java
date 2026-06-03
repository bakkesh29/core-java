package com.xworkz.javapractice.outer;

import com.xworkz.javapractice.inner.Printer;

public class HpPrinter extends Printer {

    public HpPrinter(String brand, double price, String color, int warrantyYears) {
        super(brand, price, color, warrantyYears);
    }
}