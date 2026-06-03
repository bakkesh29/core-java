package com.xworkz.javapractice.runner;

import com.xworkz.javapractice.outer.AppleSmartWatch;

public class SmartWatchRunner {

    public static void main(String[] args) {

        AppleSmartWatch watch = new AppleSmartWatch();
        watch.displayTime();
        watch.trackSteps();
    }
}