package com.xworkz.javapractice.outer;

import com.xworkz.javapractice.inner.CoffeeMug;

public class SteelCoffeeMug extends CoffeeMug {

    public void show() {
        MugType(); // accessing protected method
    }
}