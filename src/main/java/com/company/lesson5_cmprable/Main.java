package com.company.lesson5_cmprable;


import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<User> sortedSet = new TreeSet<>(new User());
        sortedSet.add(new User(1,"Shamil", "Azaxov", 26));
        sortedSet.add(new User(2,"Zamir", "Azaxov", 21));
        sortedSet.add(new User(3,"Maya", "Azaxova", 47));
        sortedSet.add(new User(4,"Cavid", "Azaxov", 51));
        sortedSet.add(new User(5,"Eyyub", "Azaxov", 94));

        sortedSet.forEach(System.out::println);
    }

}