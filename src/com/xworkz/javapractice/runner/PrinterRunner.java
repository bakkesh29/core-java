package com.xworkz.javapractice.runner;

import com.xworkz.javapractice.outer.HpPrinter;

public class PrinterRunner {

    public static void main(String[] args) {

        HpPrinter printer =
                new HpPrinter("HP", 15000, "White", 2);

        printer.display();
    }
}