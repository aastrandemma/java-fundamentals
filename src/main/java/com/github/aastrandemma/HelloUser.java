package com.github.aastrandemma;

import java.util.Scanner;
public class HelloUser {
    public static void main(String[] args) {
        String user;

        System.out.println("Input your name: ");

        Scanner scanner = new Scanner(System.in);
        user = scanner.next();

        System.out.println("Hello " + user);
    }
}
