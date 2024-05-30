package com.company.lesson7;
import com.company.lesson3.Triangle;
public class Main extends Triangle{
    public Main(int side1, int side2, int side3) {
        super(side1, side2, side3);
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(2, 3, 4);
        new Triangle(3,4,5);
        System.out.println();
    }
}