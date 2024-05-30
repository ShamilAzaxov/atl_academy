package com.company.interview;

public class Builder {
    final String shamil;
    int a = 8;
    int b;
    int c;
    int d;

    public Builder() {
        this.shamil = shamil;
    }

    public Builder(String shamil, int a) {
        this.shamil = shamil;
        this.a = a;
    }

    public Builder(String shamil,int a, int b) {
        this.a = a;
        this.shamil = shamil;
        this.b = b;
    }

    public Builder(String shamil,int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.shamil = shamil;
        this.c = c;
    }

}