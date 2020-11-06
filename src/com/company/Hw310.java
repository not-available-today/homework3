package com.company;

import java.util.Scanner;

public class Hw310 {
    public static void main(String[] args) {
        int num, j;

        Scanner userInput = new Scanner(System.in);

        System.out.println("Pick a number: ");
        num = userInput.nextInt();

        for (j = 1; j <= 10; j++) {
            System.out.printf("%d * %d = %d\n", j, num, j * num);
        }

    }
}