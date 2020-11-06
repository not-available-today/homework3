package com.company;

import java.util.Scanner;

public class Hw311 {
    public static void main(String[] args) {
        int i, number;
        boolean isPrime = false;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer to see if it's prime: ");

        number = input.nextInt();
        for (i = 2; i <= number / 2; i++) {
            if (number % 2 == 0) {
                isPrime = true;
                break;
            }
        }
        if(!isPrime)
            System.out.println(number + " is a prime number.");
        else
            System.out.println(number + " is not a prime number.");

    }
}