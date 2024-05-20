package com.company.lesson7;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        final String word = "";
        char[] charArray = word.toCharArray();
        Map<Character, Integer> hashMap = new HashMap<>();
        for (char a:charArray) {
            int count1 =(int) word.chars().filter(value -> value == a).count();
            hashMap.put(a, count1);
        }
        System.out.println(hashMap);
    }
}