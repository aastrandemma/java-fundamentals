package com.github.aastrandemma;

import java.util.Scanner;

public class ConvertTime {
    public static void main(String[] args) {
        int input, seconds, minutes, hours;
        String time;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter seconds: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter seconds in numbers: ");
                scanner.next();
            }
            input = scanner.nextInt();
        } while (input <= 0);
            seconds= input % 60;
            hours = input / 60;
            minutes = hours % 60;
            hours = hours / 60;
            time = String.format("%02d:%02d:%02d", hours, minutes, seconds);
            System.out.println(time);
    }
}