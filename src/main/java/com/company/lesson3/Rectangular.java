package com.company.lesson3;

public class Rectangular implements Shape {
    private int side1, side2;

    public Rectangular(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double calculatePerimeter() {
        return this.side1*2 + this.side2*2;
    }

    @Override
    public double calculateArea() {
        return this.side1 * this.side2;
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
}
