package com.github.aastrandemma;
public class AverageCalculator {
    public static void main(String[] args) {
        System.out.println(AverageCalculator.average(23,11,77));
    }
    public static double average(double x, double y, double z) {
        return (x + y + z) / 3;
    }
}