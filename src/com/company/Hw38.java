package com.company;

import java.util.Scanner;

public class Hw38 {
    public static void main(String[] args) {
        int sum = 0, i, counter;
        double avg;
        counter = 0;

        while (counter < 10) {
            Scanner input = new Scanner(System.in);
            System.out.println("Let's find the sum and average of 10 numbers.\nInput an integer:");
            i = input.nextInt();
            counter++;

        sum += i;
        }
        avg = sum/10;

        System.out.println("The sum of your 10 numbers is " + sum + "." +"\nThe average of those numbers is " + avg + ".");

    }
}

