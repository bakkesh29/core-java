package com.prajwal.problems;

import java.util.ArrayList;

public class ArrayListProblem {
    public static void main(String[] args) {


        ArrayList<String> student = new ArrayList<>();

        student.add("ravi");
        student.add("yashu");
        student.add("mohini");
        student.add("teju");
        student.add("abhi");

        for(String arr : student ){
            System.out.println(arr);
        }

        student.remove("yashu");

        System.out.println(student);

        System.out.println(student.get(1));

        for (int i=0; i<student.size(); i++){
            System.out.println(student.get(i));
        }
    }

}
