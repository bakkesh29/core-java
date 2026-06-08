package com.prajwal.problems;

import java.util.HashMap;
import java.util.Map;

public class HashMapProblem {
    public static void main(String[] args) {

        HashMap<Integer, String> map= new HashMap<>();

        map.put(101,"ram");
        map.put(102,"sita");
        map.put(103,"arun");
        map.put(104,"priya");

        for (Map.Entry<Integer, String> e : map.entrySet()){
            System.out.println(e);
        }

        System.out.println(map.get(102));

        map.remove(102);

        for (Map.Entry<Integer, String> e : map.entrySet()){
            System.out.println(e);
        }


    }
}
