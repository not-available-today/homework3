package com.company;

import java.util.Scanner;

public class Hw312 {
    public static void main(String[] args) {
        long fib0, fib1;
        int terms, i;
        fib0 = 0;
        fib1 = 1;
        Scanner input = new Scanner(System.in);

        System.out.println("How many terms of the Fibonacci sequence do you want to see?");
        terms = input.nextInt();

        for (i = 0; i < terms; i++) {
            System.out.printf(fib0 + " ");

            long sequence = fib0 + fib1;
            fib0 = fib1;
            fib1 = sequence;

        }
    }
}
