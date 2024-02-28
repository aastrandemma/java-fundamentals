package com.github.aastrandemma;

import java.util.Scanner;
public class CalculationInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first, second;

        System.out.println("Enter two numbers: ");
        first = scanner.nextInt();
        second = scanner.nextInt();

        System.out.println(first + " + " + second + " = " + CalculationInput.addition(first,second));
        System.out.println(first + " * " + second + " = " +  CalculationInput.multiplication(first,second));
        System.out.println( first + " / " + second + " = " + CalculationInput.division(first,second));
        System.out.println( first + " - " + second + " = " + CalculationInput.subtraction(first,second));
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

    private static float division(int first, int second){
        return (float) (first / second);
    }
}