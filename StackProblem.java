package com.prajwal.problems;

import java.util.Stack;

public class StackProblem {
    public static void main(String[] args) {


    Stack<String> browsers = new Stack<>();

    browsers.push("Google");
    browsers.push("YouTube");
    browsers.push("Instagram");
    browsers.push("Whatsapp");

        System.out.println(browsers.peek());

        browsers.pop();
        browsers.pop();

        System.out.println(browsers);

        System.out.println(browsers.isEmpty());

    }

}
