package com.company.interview;

import java.util.Objects;

public class Hamster{
    private String color;
    private int weight;
    public Hamster shamil;
    public Hamster(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public Hamster(int weight) {
        shamil = new Hamster(weight, "brown"); // Compiles but does not do what we want
    }

//    public Hamster(int weight) {
//        this(weight, "brown");
//    }




/*
 public Hamster(int weight) { // first constructor
    this.weight = weight;
    color = "brown";
}
 */

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hamster hamster = (Hamster) o;
        return weight == hamster.weight && Objects.equals(color, hamster.color);
    }

    @Override
    public int hashCode() {
        return 123;
    }

}