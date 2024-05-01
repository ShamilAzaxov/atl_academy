package com.company.lesson1;

public enum Company {
    MERCEDES("Mercedes"),
    KIA("Kia"),
    RANGE_ROVER("Range Rover"),
    BMW("Bmw");

    final String model;

    Company(String model) {
        this.model = model;
    }
}
