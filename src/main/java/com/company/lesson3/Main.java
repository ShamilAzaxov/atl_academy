package com.company.lesson3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Triangle(4,7,6));
        shapes.add(new Rectangular(10,6));
        System.out.println(shapes.get(0).calculateArea());
        System.out.println(shapes.get(0).calculatePerimeter());
        System.out.println(shapes.get(1).calculatePerimeter());
        System.out.println(shapes.get(1).calculateArea());
    }
}
