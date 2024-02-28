package com.github.aastrandemma;

import java.util.Random;
import java.util.Scanner;
public class RandomNumberGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(500);
        if (randomNumber == 0) {
            randomNumber++;
        }

        System.out.println("Hi and welcome.");
        System.out.println("Guess a number between 1 and 500.");
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int guess = 0;

        while (number != randomNumber) {
            number = scanner.nextInt();
            guess++;
            if (number == randomNumber) {
                System.out.println("\nCongratulations your guess was correct! The number was: " + randomNumber);
                System.out.println("You guessed " + guess + " times.");
                continue;
            }

            if (number > randomNumber) {
                System.out.println("Your guess was to high.");
            } else {
                System.out.println("Your guess was to low.");
            }
            System.out.println("Guess again.");
        }
    }
}