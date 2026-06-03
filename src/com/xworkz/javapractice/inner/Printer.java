package com.xworkz.javapractice.inner;

public abstract class Printer {

    String brand;
    double price;
    String color;
    int warrantyYears;

    public Printer(String brand, double price, String color, int warrantyYears) {
        this.brand = brand;
        this.price = price;
        this.color = color;
        this.warrantyYears = warrantyYears;
    }

    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
        System.out.println("Warranty: " + warrantyYears + " Years");
    }
}