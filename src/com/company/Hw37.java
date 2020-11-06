package com.company;

public class Hw37 {
    public static void main(String[] args) {
        int i, sum;
        double avg;

        sum = 0;

        for (i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        avg = sum / 50;
        System.out.println("The average of the even numbers of the first 100 natural numbers is " + avg + ".");

    }
}
