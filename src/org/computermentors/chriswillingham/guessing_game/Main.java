package org.computermentors.chriswillingham.guessing_game;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random generator = new Random();
        Scanner scanner = new Scanner(System.in);

        int number = generator.nextInt(1000);
        System.out.println(number);
        while (true) {
            System.out.print("Pick a number:");
            int guess = scanner.nextInt();
            if (number > guess) {
                System.out.println("number is greater than guess");
            } else if (number < guess) {
                System.out.println("number is less than guess");
            } else {
                System.out.println("You win!");
                break;
            }
        }
    }
}
