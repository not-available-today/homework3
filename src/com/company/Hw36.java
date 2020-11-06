package com.company;

public class Hw36 {
    public static void main(String[] args) {
        int i, sum;
        sum = 0;

        for (i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("The sum of the odd numbers of the first 100 natural numbers is " + sum + ".");

    }
}
