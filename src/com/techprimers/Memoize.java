package com.techprimers;

public class Memoize {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();

        System.out.println("Factorial of 3:");
        System.out.println(factorial.calculate(3));

        System.out.println("Cache Size: " + factorial.getMemoizeCache().size());
        System.out.println("Cache: " + factorial.getMemoizeCache());
        System.out.println("*******");
        System.out.println("*******");
        System.out.println("Factorial of 7:");
        System.out.println(factorial.calculate(7));
        System.out.println("Cache Size: " + factorial.getMemoizeCache().size());
        System.out.println("Cache: " + factorial.getMemoizeCache());

    }
}
