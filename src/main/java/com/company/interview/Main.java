package com.company.interview;

public class Main {
    public static void main(String[] args) {
        Hamster hamster = new Hamster(4);
        System.out.println(hamster.getColor());
        System.out.println(hamster.getWeight());


        System.out.println(hamster.shamil.getColor());
        System.out.println(hamster.shamil.getWeight());

        Builder builder = new Builder("Shamil", 3,4);
    }
}
