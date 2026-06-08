package com.prajwal.problems;

import java.util.HashSet;

public class HashSetProblem {
    public static void main(String[] args) {

        HashSet<Integer> sets = new HashSet<>();

        sets.add(10);
        sets.add(20);
        sets.add(30);
        sets.add(10);
        sets.add(40);
        sets.add(20);
        sets.add(50);

        System.out.println(sets);

        int total=0;
        for(Integer values: sets){
            total += values;
        }
        System.out.println("Total :"+total);
    }
}
