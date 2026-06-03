package com.xworkz.javapractice.inner;

public class BackPack {

    protected class BagPocket {

        public void showPocket() {
            System.out.println("Protected Inner Class");
        }
    }

    protected void accessPocket() {
        BagPocket pocket = new BagPocket();
        pocket.showPocket();
    }
}