package com.company.lesson3;

public class Triangle implements Shape {
    private int side1, side2, side3;
    private static int a1;


    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        System.out.println("sd,akdsad");
    }

    {
        System.out.println("Instance block");
    }

    static {
        a1 = 4;
    }

    public static void foo() {

    }

    @Override
    public double calculatePerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    @Override
    public double calculateArea() {
        double semiPerimeter = calculatePerimeter() / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }

    public static void sleep() {
        System.out.println("sleeping");
    }
}
