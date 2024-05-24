package com.company.lesson8;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student(1L, "Shamil", 33),
                new Student(4L, "Zamir", 34),
                new Student(2L, "Aqil", 23),
                new Student(1L, "Amil", 13),
                new Student(8L, "Ramil", 83)
        };
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        Comparator<Student> comparator = (s1, s2) -> s2.getName().compareTo(s1.getName());
        Arrays.sort(students, comparator);
        System.out.println(Arrays.toString(students));

        Comparator<Student> comparator1 = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };
        Arrays.sort(students, comparator1);
        System.out.println(Arrays.toString(students));
    }
}