package com.github.aastrandemma;

public class Calculation {
    public static void main(String[] args) {
        System.out.println(Calculation.addition(45,11));
        System.out.println(Calculation.multiplication(12,4));
        System.out.println(Calculation.division(24,6));
        System.out.println(Calculation.subtraction(55,12));
    }
    private static int addition(int first, int second){
        return first + second;
    }

    private static int subtraction(int first, int second){
        return first - second;
    }

    private static int multiplication(int first, int second){
        return first * second;
    }

    private static int division(int first, int second){
        return first / second;
    }
}