package com.company.lesson6_dsa;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3, "S");
        hashMap.put(1, "a");
        hashMap.put(2, "f");
        hashMap.put(10, "g");
        hashMap.put(6, "k");
        hashMap.put(4, "y");
        hashMap.put(10, "S");
        hashMap.put(90, "a");
        hashMap.put(22, "f");
        hashMap.put(19, "g");
        hashMap.put(60, "k");
        hashMap.put(44, "y");
        hashMap.put(33, "S");
        hashMap.put(18, "a");
        hashMap.put(222, "f");
        hashMap.put(100, "g");
        hashMap.put(68, "k");
        hashMap.put(43, "y");
        hashMap.put(333, "S");
        hashMap.put(1000, "a");
        hashMap.put(221, "f");
        hashMap.put(105, "g");
        hashMap.put(62, "k");
        hashMap.put(400, "y");
        System.out.println(hashMap);

        Map<Integer, String> hashtable = new Hashtable<>();

        System.out.println(hashtable);
    }
}