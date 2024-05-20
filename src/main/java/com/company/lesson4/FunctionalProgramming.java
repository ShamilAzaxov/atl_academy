package com.company.lesson4;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionalProgramming {
    public static void main(String[] args) {

        Function<String, String> function = num -> "me " + num;
        String returnIt = function.apply("23");
        System.out.println(returnIt);

        BiFunction<String, Integer, String> biFunction = (str, num) -> str + num;
        String me = biFunction.apply("Shamil ", 30);
        System.out.println(me);

        BiFunction<String, Integer, String> stringIntegerStringBiFunction = biFunction.andThen(function);

    }
}